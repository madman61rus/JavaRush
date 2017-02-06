package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by vkompaniec on 30.01.17.
 */
public class Plane implements Flyable
{
    private int seats ;
    @Override
    public void fly()
    {

    }

    Plane (int seats)
    {
        this.seats = seats;
    }
}
