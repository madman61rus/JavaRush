package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.DuplicateFormatFlagsException;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int line;
        while (input.ready()){
            line = Integer.parseInt(input.readLine());
            if ((line%2) == 0)
            {
                list.add(line);
            }
        }

        Collections.sort(list);

        for (Integer i : list )
        {
            System.out.println( i);
        }

    }
}
