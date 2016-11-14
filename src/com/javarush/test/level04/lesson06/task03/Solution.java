package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] list = new int[3];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        list[0] = Integer.parseInt(reader.readLine());
        list[1] = Integer.parseInt(reader.readLine());
        list[2] = Integer.parseInt(reader.readLine());

        for (int i=2; i >= 0; i--)
        {
            for(int y=0; y < i; y++)
            {
                if (list[y] < list[y+1])
                {
                    int buff = list[y];
                    list[y] = list[y+1];
                    list[y+1] = buff;
                }
            }
        }

        for (int i: list)
        {
            System.out.println(i);
        }

    }
}
