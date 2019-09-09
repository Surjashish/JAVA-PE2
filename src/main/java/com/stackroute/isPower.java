package com.stackroute;

public class isPower {

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
}
