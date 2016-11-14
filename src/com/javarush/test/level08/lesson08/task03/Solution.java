package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> myMap = new HashMap<String, String>();

        myMap.put("Иванов","Иван");
        myMap.put("Сидоров","Петро");
        myMap.put("Петров","Клим");
        myMap.put("Засуля","Задрот");
        myMap.put("Маркина","Хаван");
        myMap.put("Джавт","Блат");
        myMap.put("Петрова","Муслим");
        myMap.put("Тигран","Сеня");
        myMap.put("Тычин","Иван");
        myMap.put("Савельев","Илья");

        return myMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0 ;
        for (Map.Entry<String, String> search : map.entrySet()){
            if (search.getValue().equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0 ;
        for (Map.Entry<String, String> search : map.entrySet()){
            if (search.getKey().equals(lastName)) count++;
        }

        return count;

    }
}
