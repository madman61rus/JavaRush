package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        FileInputStream fileReader = new FileInputStream(path);
        Map<Integer,Integer> bytesList = new TreeMap<Integer,Integer>();

        int tmp ;

        while (fileReader.available() > 0)
        {
            tmp = fileReader.read();
            if (bytesList.containsKey(tmp)){
                bytesList.put(tmp,bytesList.get(tmp)+1);
            }else{
                bytesList.put(tmp,0);
            }
        }

        fileReader.close();

        Integer max = 0;

        for (Integer counter: bytesList.values()){
            if (counter > max) max = counter;
        }

        for (Map.Entry<Integer,Integer> entry : bytesList.entrySet())
        {
            if (max.equals(entry.getValue()))
            {

                System.out.print(entry.getKey() + " ");
            }
        }



    }
}
