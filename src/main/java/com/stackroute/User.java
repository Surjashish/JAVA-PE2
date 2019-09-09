package com.stackroute;

public class User {
    String firstName,lastName="";
    int age;
    double salary;
    public void setData(String fn,String ln,int age1,double sal)
    {
        firstName=fn;
        lastName=ln;
        age=age1;
        salary=sal;
    }
    public String getFullName()
    {
        return firstName+" "+lastName;
    }
    public boolean isValidAge(int ag)
    {
        if(ag>=18&&ag<=60)
            return true;
        else
            return false;
    }
}
