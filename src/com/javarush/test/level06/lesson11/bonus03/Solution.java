package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[5];

        for (int i = 0; i <= 4; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }

        for (int i= 4; i >= 0; i--)
        {
            for (int y=0; y < i; y++)
            {
                if ( list[y] > list[y+1]){
                    int buff = list[y];
                    list[y] = list[y+1];
                    list[y+1] = buff;
                }


            }

        }

        for (int g: list){

        System.out.println(g);

    }

    }
}
