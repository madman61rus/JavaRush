package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfFileOne = reader.readLine();
        String nameOfFileTwo = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(nameOfFileOne);
        FileOutputStream fileOutputStream = new FileOutputStream(nameOfFileTwo);

        byte[] inputStream = new byte[fileInputStream.available()];
        int count = fileInputStream.read(inputStream);

        for (int i = count -1 ; i >= 0 ; i--)
        {
            fileOutputStream.write(inputStream[i]);
        }

        fileInputStream.close();
        fileOutputStream.close();
        reader.close();


    }
}
