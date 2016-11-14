package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> mymap = new HashMap<String, String>();
        mymap.put("Нестеренко","Иван");
        mymap.put("Клименчук","Иван");
        mymap.put("Батхерт","Клим");
        mymap.put("Бустеров","Саша");
        mymap.put("Какойто","Мамойто");
        mymap.put("Гнет","Иван");
        mymap.put("Савченко","Галина");
        mymap.put("Головчук","Саша");
        mymap.put("Свахин","Ерофей");
        mymap.put("Голопередолов","Михаил");

        return mymap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> toDel = new ArrayList<String>();

        Iterator iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry) iterator.next();

            if (list.contains(entry.getValue())){
                toDel.add((String) entry.getValue());
            }else{
                list.add((String)entry.getValue());
            }


        }

        for (String str : toDel)
        {
            removeItemFromMapByValue(map,str);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
