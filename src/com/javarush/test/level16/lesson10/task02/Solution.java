package com.javarush.test.level16.lesson10.task02;

/* Отсчет на гонках
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
Пример для countSeconds=4 : [4 3 2 1 Прервано!]
4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для countSeconds=3 : [3 2 1 Марш!]
PS: метод sleep выбрасывает InterruptedException.
*/

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.table.TableRowSorter;

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();


    }

    public static class RacingClock extends Thread {
        private long startTime = System.currentTimeMillis() ;

        public RacingClock() {
            start();
        }

        public void run() {
            System.out.print("[");
            while (!Thread.currentThread().isInterrupted())
            {
                if ((System.currentTimeMillis() - startTime) >= 3500)
                {
                    System.out.print("Прервано!]");
                    Thread.currentThread().interrupt();
                    break;
                }

                 if (countSeconds > 0)
                 {

                     try
                     {
                         System.out.print(countSeconds + " ");
                         Thread.sleep(1000);
                     }
                     catch (InterruptedException e)
                     {
                         e.printStackTrace();
                     }
                     countSeconds--;
                 }
                 else
                 {
                     System.out.print("Марш!]");
                     break;
                 }




            }

        }
    }
}
