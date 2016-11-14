package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        OutputStream output = new FileOutputStream(name);
        String line ;
        while (true){
            line = reader.readLine() ;
            for (byte bt : line.getBytes())
            {
                output.write(bt);
            }

            if (!line.equals("exit"))
            {
                output.write("\n".getBytes());
            }else{
                break;
            }

        }
    }
}
