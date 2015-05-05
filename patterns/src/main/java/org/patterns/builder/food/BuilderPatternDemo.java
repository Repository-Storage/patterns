package org.patterns.builder.food;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg meal");
        vegMeal.showItems();
        System.out.println("Veg meal total cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n Non-Veg meal");
        nonVegMeal.showItems();
        System.out.println("Non veg meal total cost: " + nonVegMeal.getCost());
    }

}
