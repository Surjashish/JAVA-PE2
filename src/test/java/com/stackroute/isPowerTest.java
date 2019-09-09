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

public class isPowerTest {

    private static isPower ispower;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        ispower = new isPower();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        ispower = null;

    }

    @Test
    public void isItPowerOf4()
    {
        assertEquals(true, ispower.isPower(16));
        assertEquals(false, ispower.isPower(234));
        assertEquals(true, ispower.isPower(256));



    }

}
