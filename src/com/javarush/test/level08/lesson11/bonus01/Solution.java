package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Map<String,Integer> monthes = new HashMap<>();
        monthes.put("JANUARY",1);
        monthes.put("FEBUARY",2);
        monthes.put("MARCH",3);
        monthes.put("APRIL",4);
        monthes.put("MAY",5);
        monthes.put("JUNE",6);
        monthes.put("JULY",7);
        monthes.put("AUGUST",8);
        monthes.put("SEPTEMBER",9);
        monthes.put("OCTOBER",10);
        monthes.put("NOVEMBER",11);
        monthes.put("DECEMBER",12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        if (monthes.containsKey(month.toUpperCase())){
            System.out.println(month + " is " + monthes.get(month.toUpperCase()) + " month");
        }



    }

}
