package us.mattgreen.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.mattgreen.MealsArray;
import us.mattgreen.Meals;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MealsArrayTest {
    MealsArray m = new MealsArray();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMeals() {
        assertTrue(m.getMeals() != null);
    }
}