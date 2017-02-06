package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        String fileThree = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileOne);
        OutputStream outputStreamTwo = new FileOutputStream(fileTwo);
        OutputStream outputStreamThree = new FileOutputStream(fileThree);

        int countInput = inputStream.available();
        byte[] toFileTwo;
        byte[] toFileThree;

        if (countInput%2 != 0)
        {
            toFileTwo = new byte[countInput/2 + 1];

        }else{
            toFileTwo = new byte[countInput/2];
        }

        toFileThree = new byte[countInput - toFileTwo.length];

        int lengthOne = inputStream.read(toFileTwo);
        int lengthTwo = inputStream.read(toFileThree);

        outputStreamTwo.write(toFileTwo,0,lengthOne);

        outputStreamThree.write(toFileThree,0,lengthTwo);

        outputStreamTwo.close();
        outputStreamThree.close();
        inputStream.close();
        reader.close();

    }
}
