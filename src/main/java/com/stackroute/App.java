package com.stackroute;

/**
 * Hello world!
 *
 */
public class App
{
    public boolean isPalin( String word )
    {
        int l=word.length();String newString="";
        for(int i=l-1;i>=0;i--)
        {
            newString=newString+word.charAt(i);
        }

        System.out.println( newString );
        if(newString.equals(word)==true)
        {
            return true;
        }
        else
            return false;

    }

   public boolean isPower(int num)
   {
       int c=0;
       while(num%4==0)
       {
           num=num/4;
           if(num==1)
               c=1;

       }
       if(c==1)
           return true;
       else
           return false;
   }

   public double average(int a[])
   {
       double avg=0.0;
       for(int i=0;i<a.length;i++)
       {
           avg=avg+a[i];
       }
       avg=avg/a.length;
       return avg;
   }
   public int factorial(int n)
   {
       if(n<=12)
       {
           int fact=1;
           for(int i=1;i<=n;i++)
           {
               fact=fact*i;
           }
           return fact;
       }
       else
           System.out.println("The factorial of "+n+" is out of range");
       return 0;

   }
    public long factorial2(int n)
    {
        if(n<=20)
        {
            long fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        else
            {
            System.out.println("The factorial of " + n + " is out of range");

        }
        return 0;


    }



}

class EvenNumTes
{
    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }
}


class Membe
{
    String name="";int age;double salary;
    public void assign(String N,int AG,double SAL)
    {
        this.name=N;
        this.age=AG;
        this.salary=SAL;
    }
}
class MemberVariabl1
{
    public static String call(String name,int age,double salary)
    {
        Member ob=new Member();
        ob.assign(name,age,salary);
        System.out.println("Name= "+ob.name);
        System.out.println("Age= "+ob.age);
        System.out.println("Salary= "+ob.salary);
        return null;

    }
}
