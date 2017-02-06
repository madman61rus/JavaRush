package com.javarush.test.level18.lesson03.task02;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        FileInputStream fileReader = new FileInputStream(path);
        int tempByte = fileReader.read();
        int tmp ;

        while (fileReader.available() > 0){
            tmp = fileReader.read();
            if (tempByte > tmp) tempByte = tmp ;
        }

        System.out.println(tempByte);
        fileReader.close();
    }
}
