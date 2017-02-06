package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        FileInputStream fileReader = new FileInputStream(path);
        int tempByte = 0;
        int tmp ;

        while (fileReader.available() > 0){
            tmp = fileReader.read();
            if (tempByte < tmp ) tempByte = tmp ;
        }

        System.out.println(tempByte);
        fileReader.close();

    }


}
