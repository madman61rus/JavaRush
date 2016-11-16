package com.javarush.test.level15.lesson12.home09;

import java.util.Scanner;

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

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] params = line.substring(line.indexOf("?")+1,line.length()).split("&");

        for (String str : params )
        {

            if (str.contains("="))
            {
                System.out.print(str.substring(0,str.indexOf('=')) + " ");

            }else if (!str.substring(0,3).equals("obj") )
            {
                System.out.print(str + " ");
            }

        }

        System.out.println();

        for (String str : params )
        {
            if (str.substring(0,3).equals("obj") & str.matches(".*\\d+.*"))
            {
                alert(Double.parseDouble(str.substring(str.indexOf('=')+1,str.length())));

            }else if (str.substring(0,3).equals("obj") & !str.matches(".*\\d+.*")){
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
