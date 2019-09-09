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

public class UserTest {

    private static User user;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        user = new User();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        user = null;

    }

    @Test
    public void User()
    {
        user.setData("Mohor","Sengupta",42,50000.0);
        assertEquals("Mohor Sengupta",user.getFullName());
        assertEquals(true,user.isValidAge(user.age));

        user.setData("Surjashish","Sengupta",21,50000.0);
        assertEquals("Surjashish Sengupta",user.getFullName());
        assertEquals(true,user.isValidAge(user.age));

        user.setData("Surjashish123","Sengupta",21,50000.0);
        assertEquals("Surjashish123 Sengupta",user.getFullName());
        assertEquals(true,user.isValidAge(user.age));


    }

    @Test
    public void UserFailure()
    {
        user.setData("Mohor","Sengupta",42,50000.0);
        assertNotEquals("Mohor123 Sengupta",user.getFullName());
        assertNotEquals(false,user.isValidAge(user.age));


    }


}
