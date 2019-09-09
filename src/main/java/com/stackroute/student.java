package com.stackroute;

public class student {

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
    public double max(int a[])
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];

        }
        return max;
    }

    public double min(int a[])
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];

        }
        return min;
    }

}
