package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Строка раз");
        list.add("Строка два");
        list.add("Строка три");
        list.add("Строка четыре");
        list.add("Строка пять");

        System.out.println(list.size());

        for (String str: list)
        {
            System.out.println(str);
        }

    }
}
