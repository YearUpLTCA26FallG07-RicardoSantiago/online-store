package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {


    public static HashMap<String, Product> products;
    public static ArrayList<Product> cart;

    public static void main(String[] args){
        products = loadProducts();

        showScreenHome();


        displayItems(products);






    }

    public static HashMap<String, Product> loadProducts(){
        //this will eventually load a file

        HashMap<String, Product> result = new HashMap<>();
        result.put("asdf", new Product("asdf", "asdf asdf", 6.99, "misc"));

        return result;
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

        System.out.println("Show Display products menu");

        String menutext = """
                Display Products
                
                1- Display all praoducts
                2- Search for products
                3- Add products to cart
                Q- exit to main menu
                Enter your command:""";
    //Display all , or seasrch

        //Add to cart

        //Go back
    }

    public static void displayItems(HashMap<String, Product> products){
        //display items in a nice formatted table;
        System.out.println("SKU              |Name                                 |DEPT|                        |Price");
        for (Product p : products.values()){
            System.out.printf("%10s  | %25s  | %13s  |%.2f\n", p.getSku(), p.getName(), p.getDepartment(), p.getPrice());
        }

    }

}
