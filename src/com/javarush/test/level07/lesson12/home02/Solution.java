package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<String>();
        String tmp;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i=0; i <=N -1 ; i++)
        {
            list.add(reader.readLine());
        }

        for (int i=0; i <= M-1; i++)
        {
            tmp = list.get(0);
            list.add(tmp);
            list.remove(0);
        }

        for (String str:
             list)
        {
            System.out.println(str);
        }

    }
}
