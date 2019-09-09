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

public class FactorialTest {

    private static Factorial factorial;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        factorial = new Factorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        factorial = null;

    }
    @Test
    public void Factorial()
    {
        assertEquals("The factorial of 1 is 1",factorial.factorial(1));
        assertEquals("The factorial of 2 is 2",factorial.factorial(2));
        assertEquals("The factorial of 3 is 6",factorial.factorial(3));
        assertEquals("The factorial of 4 is 24",factorial.factorial(4));
        assertEquals("The factorial of 6 is 720",factorial.factorial(6));
        assertEquals("The factorial of 12 is 479001600",factorial.factorial(12));


        assertEquals("The factorial of 1 is 1",factorial.factorial2(1));
        assertEquals("The factorial of 20 is 2432902008176640000",factorial.factorial2(20));





    }
}
