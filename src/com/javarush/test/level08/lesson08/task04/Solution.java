package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/


public class Solution
{


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Shwartznegger", new Date("SEPTEMBER 1 1990"));
        map.put("Pimsler", new Date("AUGUST 23 1990"));
        map.put("Gotte", new Date("JANUARY 4 1950"));
        map.put("Arr", new Date("FEBRUARY 3 1930"));
        map.put("Stalin", new Date("JULY 3 1935"));
        map.put("Rocky", new Date("OCTOBER 3 1933"));
        map.put("Micky", new Date("JULY 3 1967"));
        map.put("Val", new Date("MARCH 4 1930"));
        map.put("Stala", new Date("JULY 3 1930"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() ;
            if ((month == 5 ) || (month == 6) || (month == 7))
                iterator.remove();
        }

    }
}
