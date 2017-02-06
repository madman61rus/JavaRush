package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
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

        Integer min = 10000 ;

        for (Integer counter: bytesList.values()){
            if (counter < min) min = counter;
        }

        for (Map.Entry<Integer,Integer> entry : bytesList.entrySet())
        {
            if (min.equals(entry.getValue()))
            {

                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
