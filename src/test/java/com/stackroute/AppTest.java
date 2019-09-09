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
public class AppTest
{

    private static App app;
    private static EvenNumTest even;
    private static Member member;
    private static MemberVariable membervariable;



    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        app = new App();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        app = null;

    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isItPalindrome()
    {
        assertEquals(true, app.isPalin("mom"));
        assertEquals(false, app.isPalin("mommy"));
        assertEquals(false, app.isPalin("mom123"));
    }

    @Test
    public void isItPowerOf4()
    {
        assertEquals(true, app.isPower(16));
        assertEquals(false, app.isPower(234));
        assertEquals(true, app.isPower(256));



    }
    @Test
    public void EvenNumTest()
    {
        assertEquals(true, even.isEven(16));
        assertEquals(false, even.isEven(17));
        assertEquals(true, even.isEven(1664728));

    }
    @Test
    public void Student()throws IOException
    {
        Scanner in=new Scanner(System.in);
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Students ");
        int n=Integer.parseInt(String.valueOf(ob.readLine()));


        int marks[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the grade for student "+(i+1));
//            marks[i]=in.nextInt();
            marks[i]=80;
            if(marks[i]>100)
            {
                System.out.println("Invalid Input");
                break;

            }
        }

        System.out.println("Average = "+ app.average(marks));


    }
    @Test
    public void Factorial()
    {
        System.out.println("IntFactorials");
        int i;
        for(i=1;i<14;i++)
        {
            System.out.println("The factorial of "+i+" is "+app.factorial(i));
        }
        System.out.println("Long factorials");
        for(i=1;i<22;i++)
        {
            System.out.println("The factorial of "+i+" is "+app.factorial2(i));
        }

    }
    @Test
    public void member()
    {
        System.out.println(membervariable.call("Surja",21,50000));
    }


}
