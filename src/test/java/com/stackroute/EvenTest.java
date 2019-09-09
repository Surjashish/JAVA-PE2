package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class EvenTest {

    private static EvenNumTest even;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        even = new EvenNumTest();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        even = null;

    }


    @Test
    public void EvenNumTest()
    {
        assertEquals(true, even.isEven(16));
        assertEquals(false, even.isEven(17));
        assertEquals(true, even.isEven(1664728));

    }

}
