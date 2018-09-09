package us.mattgreen;

/**
 * ENUM FOR MEAL TYPE
 * @author kpatr
 * @version 1.0.0
 */
public enum MealType {
    BREAKFAST("Breakfast"), DESSERT("Dessert"), DINNER("Dinner"), LUNCH("Lunch");

    private String meal;

    MealType(String meal) {
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }
}
