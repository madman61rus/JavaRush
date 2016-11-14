package com.javarush.test.level08.lesson11.home09;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Date ourDate = formatter.parse(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(ourDate);

        Calendar startOfYear = Calendar.getInstance();
        Date dateYear = formatter.parse("JANUARY 1 " + date.substring(date.length()-4));
        startOfYear.setTime(dateYear);

        long days = TimeUnit.DAYS.convert(ourDate.getTime() - dateYear.getTime(), TimeUnit.MILLISECONDS);


        if (((days%2) == 0) || (days == 0))
        {
            return true;
        }else{
            return false;
        }


    }
}
