package com.entities;

public class Dish {
    private boolean hasMeat;
    private boolean hasDiary;
    private boolean hasEggs;
    private boolean hasNoAnimalProducts;
    private boolean hasWheat;
    private boolean hasAlergenics;
    //private String type; // Protein, aditional, dessert, vegan protein

    private String name;
    private String slug;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSlug(){
        return this.slug;
    }
    public void setSlug(String slug){
        this.slug = slug;
    }

    public boolean getHasMeat(){
        return this.hasMeat;
    }
    public void setHasMeat(boolean hasMeat){
        this.hasMeat = hasMeat;
    }

    public boolean getHasDiary(){
        return this.hasDiary;
    }
    public void setHasDiary(boolean hasDiary){
        this.hasDiary = hasDiary;
    }

    public boolean getHasEggs(){
        return this.hasEggs;
    }
    public void setHasEggs(boolean hasEggs){
        this.hasEggs = hasEggs;
    }

    public boolean getHasNoAnimalProducts(){
        return this.hasNoAnimalProducts;
    }
    public void setHasNoAnimalProducts(boolean hasNoAnimalProducts){
        this.hasNoAnimalProducts = hasNoAnimalProducts;
    }

    public boolean getHasWheat(){
        return this.hasWheat;
    }
    public void setHasWheat(boolean hasWheat){
        this.hasWheat = hasWheat;
    }

    public boolean getHasAlergenics(){
        return this.hasAlergenics;
    }
    public void setHasAlergenics(boolean hasAlergenics){
        this.hasAlergenics = hasAlergenics;
    }

}
