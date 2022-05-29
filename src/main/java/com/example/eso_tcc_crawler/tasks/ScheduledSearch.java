package com.example.eso_tcc_crawler.tasks;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.example.eso_tcc_crawler.domain.DishService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import com.example.eso_tcc_crawler.tasks.MealType;
@Component
public class ScheduledSearch {
    private static final Logger log = LoggerFactory.getLogger(ScheduledSearch.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private DishService dishService;

    @Scheduled(fixedRate = 6000000)
    public void reportCurrentTime(){
        //log.info("Time is now {}", dateFormat.format(new Date()));

        try{
            Document doc = Jsoup.connect("https://pra.ufpr.br/ru/ru-central/").get();
            Elements elements = doc.select("#post > div:nth-child(3) > figure:nth-child(3)");

            for (Element element : elements){
                //System.out.println(element.toString());
                Elements menu = element.select("tbody > tr> td");


                for (int i = 0; i < menu.size()-1; i+=2){

                    String meal = menu.get(i).text();
                    meal = meal.replace("Ã", "A").replace("É", "E").replace("Ç", "C").replaceAll(" ", "_");
                    MealType mealType = MealType.valueOf(meal);
                    String dishesString = menu.get(i+1).toString();

                    // System.out.println("Meal: " + meal + " | " + mealType.getValue());
                    // System.out.println("getValue() " + mealType.getValue());
                    // System.out.println("name()" + mealType.name());
                    // System.out.println("toString()" + mealType.toString());
                    // System.out.println(".getClass()" + mealType.getClass());
                                        
                    
                    List<String> subdishes = Arrays.asList(dishesString.split("<br>"));
                    dishService.batchCreateDishes(subdishes);
                    // System.out.println("\n");
                }

            }

        } catch (IOException e) {
            System.out.println("IOException");
        }
        
    }
}