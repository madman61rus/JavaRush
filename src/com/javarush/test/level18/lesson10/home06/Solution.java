package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        FileInputStream fileInput = new FileInputStream(args[0]);

        Map<Integer,Integer> resultArray = new TreeMap<Integer,Integer>();

        while (fileInput.available() > 0)
        {
            int character = fileInput.read();
            if (resultArray.containsKey(character))
            {
                resultArray.put(character,resultArray.get(character) + 1);
            }else{
                resultArray.put(character, 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : resultArray.entrySet())
        {
            System.out.println(Character.toString((char) entry.getKey().byteValue()) + " " + entry.getValue());
        }

        fileInput.close();

    }
}
