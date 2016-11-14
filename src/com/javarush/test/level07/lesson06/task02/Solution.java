package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
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
        int max = 0 ;
        int tmpSize;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i <= 4; i++)
        {
            tmp = reader.readLine();
            tmpSize = tmp.length();
            list.add(tmp);
            sizes[i] = tmpSize;
            max = ( tmpSize > max) ? tmpSize : max ;
        }

        for (String str :
             list)
        {
            if (str.length() == max) System.out.println(str);
        }




    }
}
