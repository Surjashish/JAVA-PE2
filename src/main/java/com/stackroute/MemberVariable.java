package com.stackroute;

public class MemberVariable {
    public static String call(String name,int age,double salary)
    {
        Member ob=new Member();
        ob.assign(name,age,salary);
        System.out.println("Name= "+ob.name);
        System.out.println("Age= "+ob.age);
        System.out.println("Salary= "+ob.salary);
        return "Name= "+ob.name+" Age= "+ob.age+" Salary= "+ob.salary;

    }
}
