package com.javarush.test.level13.lesson11.bonus03;

public class Robot implements Attackable, Defensable
{

    private String name;

    public Robot(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }


    @Override
    public BodyPart attack()
    {
        return null;
    }

    @Override
    public BodyPart defense()
    {
        return null;
    }
}
