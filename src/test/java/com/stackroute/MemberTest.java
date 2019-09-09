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

public class MemberTest {

    private static Member member;
    private static MemberVariable membervariable;

    @Test
    public void member()
    {

        assertEquals("Name= Surja Age= 21 Salary= 50000.0",membervariable.call("Surja",21,50000.0));
        assertEquals("Name= Sengupta Age= 21 Salary= 70000.0",membervariable.call("Sengupta",21,70000.0));
        assertEquals("Name= Mohor Age= 21 Salary= 100000.0",membervariable.call("Mohor",21,100000.0));

    }

    @Test
    public void memberFailure()
    {

        assertNotEquals("Name= Surj12a Age= 21 Salary= 50000.0",membervariable.call("Surja",21,50000.0));
        assertNotEquals("Name= Sengup11ta Age= 21 Salary= 70000.0",membervariable.call("Sengupta",21,70000.0));
        assertNotEquals("Name= Moho23r Age= 21 Salary= 100000.0",membervariable.call("Mohor",21,100000.0));

    }
}

