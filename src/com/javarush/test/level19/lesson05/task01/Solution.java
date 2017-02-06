package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String secondName = reader.readLine();

        FileReader fileReader = new FileReader(firstName);
        FileWriter fileWriter = new FileWriter(secondName);
        char buff ;
        boolean odd = false;
        while (fileReader.ready())
        {
            if (odd)
            {
                fileWriter.write(fileReader.read());
                odd = false;
            }else{
                fileReader.read();
                odd = true;
            }
        }

        fileReader.close();
        fileWriter.close();
        reader.close();


    }
}
