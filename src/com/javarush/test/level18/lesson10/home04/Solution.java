package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();

        FileInputStream firstFile = new FileInputStream(fileOne);
        FileInputStream secondFile = new FileInputStream(fileTwo);



        byte[] firstFileData = new byte[firstFile.available()];
        byte[] secondFileData = new byte[secondFile.available()];

        int countFirst = firstFile.read(firstFileData);
        int countSecond = secondFile.read(secondFileData);

        firstFile.close();
        FileOutputStream firstOutFile = new FileOutputStream(fileOne);

        firstOutFile.write(secondFileData,0,countSecond);
        firstOutFile.write(firstFileData,0,countFirst);


        firstOutFile.close();
        secondFile.close();
        firstOutFile.close();
        reader.close();

    }
}
