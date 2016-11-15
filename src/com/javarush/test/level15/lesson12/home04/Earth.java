package com.javarush.test.level15.lesson12.home04;

/**
 * Created by vkompaniec on 15.11.16.
 */
public class Earth implements Planet
{
    private static Earth earth = null ;

    private Earth()
    {

    }

    public static Earth getInstance()
    {
        if (earth == null)
        {
            earth = new Earth();
        }

        return earth;
    }
}
