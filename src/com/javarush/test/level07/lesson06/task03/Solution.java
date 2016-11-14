package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        int[] sizes = new int[5];
        String tmp;
        int min = 100 ;
        int tmpSize;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i <= 4; i++)
        {
            tmp = reader.readLine();
            tmpSize = tmp.length();
            list.add(tmp);
            sizes[i] = tmpSize;
            min = (tmpSize < min) ? tmpSize : min ;
        }



        for (String str :
                list)
        {
            if (str.length() == min) System.out.println(str);
        }

    }
}
