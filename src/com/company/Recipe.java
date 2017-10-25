package com.company;


import java.util.ArrayList;

public class Recipe {

    private String Ingredients ;
    private String  Directions;
    private ArrayList<String> arrayIngredients;



    public ArrayList<String> getArrayIngredients() {
        return arrayIngredients;
    }

    public void setArrayIngredients(ArrayList<String> arrayIngredients) {
        this.arrayIngredients = arrayIngredients;
    }








    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public String getDirections() {
        return Directions;
    }

    public void setDirections(String directions) {
        Directions = directions;
    }

    public ArrayList<String>  addIngrediets( String ingredients)
    {

          arrayIngredients.add(ingredients);
          return arrayIngredients;

    }
}
