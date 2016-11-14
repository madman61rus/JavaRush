package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> myHash = new HashMap<String, String>();

        myHash.put("арбуз","ягода");
        myHash.put("банан","трава");
        myHash.put("вишня","ягода");
        myHash.put("груша","фрукт");
        myHash.put("дыня","овощ");
        myHash.put("ежевика","куст");
        myHash.put("жень-шень","корень");
        myHash.put("земляника","ягода");
        myHash.put("ирис","цветок");
        myHash.put("картофель","клубень");

        for (Map.Entry<String, String> map :
             myHash.entrySet())
        {
            System.out.println(map.getKey() + " - " + map.getValue());
        }

    }
}
