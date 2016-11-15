package com.javarush.test.level15.lesson12.home04;

/**
 * Created by vkompaniec on 15.11.16.
 */
public class Moon implements Planet
{
    private static Moon moon = null ;

    private Moon()
    {

    }

    public static Moon getInstance()
    {
        if (moon == null)
        {
            moon = new Moon();
        }

        return moon;
    }
}
