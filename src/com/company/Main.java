package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Recipe recipe ;
        Scanner keyboard= new Scanner (System.in);
        ArrayList<Recipe> recipeArrayList= new ArrayList<> ();
        ArrayList<String> ingridetList= new ArrayList<>();
        ArrayList<String>directionsList= new ArrayList<>();
        String answer;

        do{
            recipe = new Recipe ();
            System.out.println ("Enter the ingredient :" );
             recipe.setIngredients ( keyboard.nextLine () );




            System.out.println ("Do you want to add more ingredients?(yes/no)" );
            answer=keyboard.nextLine ();
            ingridetList.add(recipe.getIngredients());
            recipe.setArrayIngredients(ingridetList);

        }while(answer.equalsIgnoreCase ( "yes" )||!answer.equalsIgnoreCase ( "no" ));



        System.out.println ("Enter the directions for the ingredients: " );
        recipe.setDirections ( keyboard.nextLine () );
      //  directionsList.add(recipe.getIngredients());



        recipeArrayList.add ( recipe );

        for(Recipe recipe1:recipeArrayList) {


                 for(String ingRec: recipe1.getArrayIngredients())
                       {
                           System.out.println ( "The Ingredients  is : " + ingRec );
                       }
            System.out.println ("The Directions is : " + recipe1.getDirections () );
        }

    }
}
