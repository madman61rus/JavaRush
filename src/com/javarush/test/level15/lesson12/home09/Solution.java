package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "" ;

        try
        {
            line = reader.readLine();

        }catch (IOException e)
        {
            System.out.println(e);
        }

        String param = line.substring(line.indexOf('?')+1,line.length()-1);
        String[] splitedParameters = param.split("&");

        for (String str :splitedParameters
                )
        {
            if (!str.contains("obj"))
            {
                if (str.contains("="))
                {
                    System.out.print(str.substring(0, str.indexOf("="))+ " ");
                } else
                {
                    System.out.print(str + " ");
                }
            }
        }

            System.out.println();

        for (String str :splitedParameters
             )
        {
            if (str.contains("obj") && str.contains("."))
            {
                alert(Double.parseDouble(str.substring(str.indexOf('=')+1,str.length())));

            }else if (str.contains("obj") && !str.contains("."))
            {
                alert(str.substring(str.indexOf('=')+1,str.length()));
            }

        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
