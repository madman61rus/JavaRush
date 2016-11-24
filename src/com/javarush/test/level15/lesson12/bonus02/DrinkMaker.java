package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by vkompaniec on 22.11.16.
 */
public abstract class DrinkMaker
{
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour() ;

    public void makeDrink()
    {
        getRightCup();
        putIngredient();
        pour();
    }
}
