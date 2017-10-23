package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Recipe recipe ;
        Scanner keyboard= new Scanner (System.in);
        ArrayList<Recipe> recipeArrayList= new ArrayList<> ();
        String answer;

        do{
            recipe = new Recipe ();
            System.out.println ("Enter the ingredient :" );
             recipe.setIngredients ( keyboard.nextLine () );




            System.out.println ("Do you want to add more ingredients?(yes/no)" );
            answer=keyboard.nextLine ();

        }while(answer.equalsIgnoreCase ( "yes" )||!answer.equalsIgnoreCase ( "no" ));



        System.out.println ("Enter the directions for the ingredients: " );
        recipe.setDirections ( keyboard.nextLine () );


        recipeArrayList.add ( recipe );

        for(Recipe recipe1:recipeArrayList) {


            System.out.println ( "The Ingredients  are : " + recipe1.getIngredients ( ) );
        }
        for(Recipe recipe1:recipeArrayList)
        {

            System.out.println ("The Directions are : " + recipe1.getDirections () );
        }

    }
}
