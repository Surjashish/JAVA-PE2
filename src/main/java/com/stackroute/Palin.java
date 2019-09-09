package com.stackroute;

public class Palin {

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
}
