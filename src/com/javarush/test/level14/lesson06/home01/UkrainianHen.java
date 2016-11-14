package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vkompaniec on 11.11.16.
 */
public class UkrainianHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 150;
    }

    public String getDescription(){

        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
