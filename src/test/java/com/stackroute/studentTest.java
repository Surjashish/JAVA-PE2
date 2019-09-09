package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class studentTest {

    private static student stud;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        stud = new student();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        stud = null;

    }

    @Test
    public void studentDetails()
    {
        double delta=1e-3;
        assertEquals(20.0, stud.average(new int[]{20, 20}),delta);
        assertEquals(20.0, stud.max(new int[]{20, 20}),delta);
        assertEquals(20.0, stud.min(new int[]{20, 20}),delta);

        assertEquals(40.0, stud.average(new int[]{40, 20,60}),delta);
        assertEquals(60.0, stud.max(new int[]{40, 20,60}),delta);
        assertEquals(20.0, stud.min(new int[]{40, 20,60}),delta);

        assertEquals(30.0, stud.average(new int[]{40, 20,60,10,20}),delta);
        assertEquals(60.0, stud.max(new int[]{40, 20,60,10,20}),delta);
        assertEquals(10.0, stud.min(new int[]{40, 20,60,10,20}),delta);
    }


    @Test
    public void studentDetailsFailure()
    {
        double delta=1e-3;
        assertNotEquals(20.011, stud.average(new int[]{20, 20}),delta);
        assertNotEquals(210.0, stud.max(new int[]{20, 20}),delta);
        assertNotEquals(202.0, stud.min(new int[]{20, 20}),delta);
    }


}
