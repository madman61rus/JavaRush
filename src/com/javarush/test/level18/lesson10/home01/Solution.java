package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        String fileName = args[0];
        int countEnglish = 0;

        if (fileName.isEmpty()){
            throw new FileNotFoundException();
        }

        InputStream fileStream = new FileInputStream(fileName);

        byte[] fileData = new byte[fileStream.available()];
        int counter = fileStream.read(fileData);

        for (int i : fileData){
            if ((i > 64 && i < 91) || ( i > 96 && i < 123))
            {
                countEnglish++;
            }
        }

        System.out.println(countEnglish);

        fileStream.close();

    }
}
