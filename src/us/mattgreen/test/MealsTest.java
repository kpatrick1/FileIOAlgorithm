package us.mattgreen.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.mattgreen.MealType;
import us.mattgreen.Meals;

import static org.junit.Assert.*;

public class MealsTest {
    Meals m = new Meals(MealType.BREAKFAST,"Donut",54);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMealType() {
        assertEquals(MealType.BREAKFAST, m.getMealType());
    }

    @Test
    public void getItem() {
        assertTrue(m.getItem() == "Donut");
    }

    @Test
    public void getCalories() {
        assertTrue(m.getCalories() == 54);
        assertFalse(m.getCalories() == 54.5);
    }

}