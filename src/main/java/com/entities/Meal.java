package com.entities;
import java.util.Date;
import com.entities.Dish;
import java.util.List;

public class Meal {
    private Date date;
    private List<Dish> dishes;

    public Meal(Date date, List<Dish> meals){
        this.setDate(date);
        this.setDishes(meals);
    }

    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    public List<Dish> getDishes(){
        return this.dishes;
    }
    public void setDishes(List<Dish> dishes){
        this.dishes = dishes;
    }
}
