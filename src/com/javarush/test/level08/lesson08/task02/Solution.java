package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();

        Random rnd = new Random();

        for (int i=0; i < 20 ; i++)
        {
            set.add(i);
        }

        return set ;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> numbers = set.iterator();

        while (numbers.hasNext())
        {
            if (numbers.next() > 10){
                numbers.remove();
            }
        }

        return set;

    }
}
