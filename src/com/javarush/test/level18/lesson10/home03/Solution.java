package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameFirst = reader.readLine();
        String fileNameSecond = reader.readLine();
        String fileNameThird = reader.readLine();

        //FileInputStream firstInputStream = new FileInputStream(fileNameFirst);
        FileInputStream secondInputStream = new FileInputStream(fileNameSecond);
        FileInputStream thirdInputStream = new FileInputStream(fileNameThird);

        // byte[] firstByteArray = new byte[firstInputStream.available()];
        byte[] secondByteArray = new byte[secondInputStream.available()];
        byte[] thirdByteArray = new byte[thirdInputStream.available()];

        //int counterFirst = firstInputStream.read(firstByteArray);
        int counterSecond = secondInputStream.read(secondByteArray);
        int counterThird = thirdInputStream.read(thirdByteArray);

        // firstInputStream.close();
        secondInputStream.close();
        thirdInputStream.close();

        FileOutputStream firstOutputStream = new FileOutputStream(fileNameFirst);

        firstOutputStream.write(secondByteArray, 0 , counterSecond);
        firstOutputStream.write(thirdByteArray, 0, counterThird);

        reader.close();
        firstOutputStream.close();

    }
}
