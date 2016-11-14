package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] arr = {1,2,3,4,5};
        int[] ints = {1,2};
        int[] ints2 = {3,4,5,6};
        int[] ints3 = {2,3,4,5,6,7,7};
        int[] ints4 = {};

        ArrayList<int[]> list = new ArrayList<>();
        list.add(arr);
        list.add(ints);
        list.add(ints2);
        list.add(ints3);
        list.add(ints4);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
