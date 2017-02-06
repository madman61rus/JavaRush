package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firsFileName = reader.readLine();
        String secondFileName = reader.readLine();

        BufferedReader firstFile = new BufferedReader(new FileReader(firsFileName));
        BufferedWriter secondFile = new BufferedWriter(new FileWriter(secondFileName));

        String[] stringSplitted = firstFile.readLine().split(" ");

        for (String str : stringSplitted)
        {
            secondFile.write(String.format("%d ", Math.round(Float.parseFloat(str))));
        }

        secondFile.flush();

        firstFile.close();
        secondFile.close();
        reader.close();

    }
}
