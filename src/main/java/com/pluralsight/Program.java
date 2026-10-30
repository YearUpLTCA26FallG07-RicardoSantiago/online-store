package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {


    public static HashMap<String, Product> products;
    public static ArrayList<Product> cart;

    public static void main(String[] args){
        products = loadProducts();


        displayItems(products);






    }

    public static HashMap<String, Product> loadProducts(){
        //this will eventually load a file

        HashMap<String, Product> result = new HashMap<>()
    }


    public static void showScreenHome(){

        //As a loop

        //Display Products

        //Display Cart

        //Exit
    }

    public static void showScreenDisplayCart(){

        //Check out (Not functional yet)

        //Remove product

        //Display items on cart

        //Display total sales amount

        //Go back to Home Screen



    }

    public static void showScreenDisplayProducts(){
    //Display all , or seasrch

        //Add to cart

        //Go back
    }

    public static void displayItems(HashMap<String, Product> products){
        //display items in a nice formatted table

    }

}
