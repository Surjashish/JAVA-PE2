package com.stackroute;
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
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PalinTest
{

    private static Palin palin;




    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        palin = new Palin();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        palin = null;

    }



    @Test
    public void isItPalindrome()
    {
        assertEquals(true, palin.isPalin("mom"));
        assertEquals(false, palin.isPalin("mommy"));
        assertEquals(false, palin.isPalin("mom123"));
    }


    @Test
    public void isItPalindromeFailure()
    {
        assertNotEquals(false, palin.isPalin("mom"));
        assertNotEquals(true, palin.isPalin("mommy"));
        assertNotEquals(true, palin.isPalin("mom123"));
    }
}
