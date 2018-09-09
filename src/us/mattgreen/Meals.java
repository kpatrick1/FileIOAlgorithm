package us.mattgreen;

/**
 * MEALS CLASS HOLDS INFORMATION ABOUT A MEAL
 * @author kpatr
 * @version 1.0.0
 */
public class Meals {
    private MealType mealType;
    private String item;
    private int calories;

    /**
     * CONSTRUCTOR TO CREATE A MEAL
     * @param mealType MEAL TYPE
     * @param item ITEM
     * @param calories CALORIES
     */
    public Meals(MealType mealType, String item, int calories) {
        this.mealType = mealType;
        this.item = item;
        this.calories = calories;
    }

    /**
     * GETS THE MEAL TYPE
     * @return MEAL TYPE
     */
    public MealType getMealType() {
        return mealType;
    }

    /**
     * GETS THE ITEM
     * @return ITEM
     */
    public String getItem() {
        return item;
    }

    /**
     * GET THE CALORIES
     * @return CALORIES
     */
    public int getCalories() {
        return calories;
    }

    /**
     * COMPARES TWO OBJECTS OVERRIDING EXISTING
     * @param o OBJECT
     * @return TRUE / FALSE
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meals meals = (Meals) o;

        if (getCalories() != meals.getCalories()) return false;
        if (getMealType() != meals.getMealType()) return false;
        return getItem().equals(meals.getItem());
    }

    /**
     * SOME HASH CODE THING THAT I HAVE NO IDEA WHAT IT IS*
     * @return INT
     */
    @Override
    public int hashCode() {
        int result = getMealType().hashCode();
        result = 31 * result + getItem().hashCode();
        result = 31 * result + getCalories();
        return result;
    }

    /**
     * TO STRING OVERRIDE
     * @return STRING OF MEAL ITEM AND CALORIES
     */
    @Override
    public String toString() {
        return "Meals{" +
                "mealType=" + mealType +
                ", item='" + item + '\'' +
                ", calories=" + calories +
                '}';
    }

}
