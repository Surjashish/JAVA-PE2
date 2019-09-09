package com.stackroute;

public class Factorial {

    public String factorial(int n)
    {
        if(n<=12)
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return "The factorial of "+n+" is "+fact;
        }
        else
            System.out.println("The factorial of "+n+" is out of range");
        return null;

    }
    public String factorial2(int n)
    {
        if(n<=20)
        {
            long fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return "The factorial of "+n+" is "+fact;
        }
        else
        {
            System.out.println("The factorial of " + n + " is out of range");

        }
        return null;


    }
}
