package com.javarush.test.level15.lesson12.home05;

/**
 * Created by vkompaniec on 15.11.16.
 */
public class SubSolution extends Solution
{
    public SubSolution()
    {
    }

    public SubSolution(Integer a)
    {
        super(a);
    }

    public SubSolution(Double db)
    {
        super(db);
    }

    private SubSolution (String str){ }
    private SubSolution (Float fl) {}
    private SubSolution (Long lg) {}

    protected SubSolution(int i)
    {
        super(i);
    }

    protected SubSolution(String str, int i)
    {
        super(str, i);
    }

    protected SubSolution(Float fl, Integer i)
    {
        super(fl, i);
    }

    SubSolution(String str, Integer io)
    {
        super(str, io);
    }

    SubSolution(Long lg, String str)
    {
        super(lg, str);
    }

    SubSolution(Double db, Double lt)
    {
        super(db, lt);
    }
}
