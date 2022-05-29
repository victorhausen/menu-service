package com.example.eso_tcc_crawler.domain;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DishService {
    List<String> types = Arrays.asList("protein", "vegan protein", "aditional", "dessert");


    public void batchCreateDishes(List<String> dishes){
        dishes.forEach((String e) -> System.out.println("Dish: "+e.replaceAll("<.+?>", "")));
    }
}
