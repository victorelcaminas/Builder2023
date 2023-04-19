/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builder;

/**
 *
 * @author victor
 */
public class Main {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total: " + vegMeal.getCost());
        Meal chickenMeal = builder.prepareNoVegMeal();
        chickenMeal.showItems();
        System.out.println("Total: " + chickenMeal.getCost());
    }
}
