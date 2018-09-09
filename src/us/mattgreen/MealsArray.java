package us.mattgreen;

import java.util.ArrayList;

/**
 * A LIST OF ALL MEALS
 * @author kpatr
 * @version 1.1.0
 */
public class MealsArray {
    private ArrayList<Meals> Meals = new ArrayList<>();
    //private Meals[] meals = new Meals[100];
    private int i = 0;
    private int calories;

    /**
     * ADD NEW MEAL WITH STRING VALUES
     * @param arg1 MEAL TYPE
     * @param arg2 ITEM
     * @param arg3 CALORIES
     */
    public void addElementWithStrings(String arg1, String arg2, String arg3) {
        MealType mealType;
        //if (i < meals.length) {

            switch (arg1) {
                case "Breakfast":
                    mealType = MealType.BREAKFAST;
                    break;
                case "Lunch":
                    mealType = MealType.LUNCH;
                    break;
                case "Dinner":
                    mealType = MealType.DINNER;
                    break;
                case "Dessert":
                    mealType = MealType.DESSERT;
                    break;
                default:
                    mealType = MealType.DINNER;
                    System.out.println("Invalid Meal Type " + arg1 + ", defaulted to Dinner.");
            }

            if (arg3.matches("-?\\d+(\\.\\d+)?")) {
                calories = Integer.parseInt(arg3);
            } else {
                calories = 100;
                System.out.println("Invalid Calories " + arg3 + ", defaulted to 100.");
            }
            Meals.add( new Meals(mealType, arg2, calories));
            //meals[i++] = new Meals(mealType, arg2, calories);
        /*}
        else {
            System.out.println("Items exceeded system size.  File has " + i + ", while the system can only handle " + meals.length + ".");
        }*/
    }

    /**
     * GETS MEAL ARRAYLIST
     * @return MEALS AS ARRAYLIST
     */
    public ArrayList<Meals> getMeals() {
        return Meals;
    }

    /**
     * PRINT ALL MEALS
     */
    public void printAllMeals() {
        for (Meals item: Meals) {
            if (item != null) {
                System.out.println(item);
            }

        }
    }

    /**
     * PRINT MEALS BY PROVIDED MEAL TYPE
     * @param mealType TYPE OF MEAL
     */
    public void printMealsByType(MealType mealType) {
        for (Meals item: Meals) {
            if (item != null && item.getMealType() == mealType) {
                System.out.println(item);
            }

        }
    }

    /**
     * SEARCH FOR MEAL BY NAME
     * @param s STRING TO SEARCH
     */
    public void printByNameSearch(String s) {
        for (Meals item: Meals) {
            if (item != null && item.getItem().indexOf(s) >= 0) {
                System.out.println(item);
            }

        }
    }
}
