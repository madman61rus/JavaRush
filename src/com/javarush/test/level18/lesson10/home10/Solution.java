package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "" ;
        Map<Integer,String> files = new TreeMap<Integer,String>();
        Path path = null ;

        while ( !(fileName = reader.readLine()).equals("end") )
        {
            String index = fileName.split("\\.")[2].replace("part","");
            Integer number = Integer.parseInt(index);
            files.put(number,fileName);
            path = Paths.get(fileName);
        }

        reader.close();

        String newPath = path.getParent().toString() ;
        String newFileName = path.getFileName().toString().split("\\.")[0];
        newFileName += "." + path.getFileName().toString().split("\\.")[1];

        BufferedInputStream fileReader = null;
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path.getParent().resolve(newFileName).toString(),true));


        for (Map.Entry<Integer,String> entry : files.entrySet())
        {
            fileReader = new BufferedInputStream(new FileInputStream(entry.getValue()));
            while ( fileReader.available() > 0)
            {
                outputStream.write(fileReader.read());
            }
        }

        fileReader.close();
        outputStream.close();


    }
}
