package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        Thread firstThread = new Thread(new SpecialThread());
        Thread secondThread = new Thread(new SpecialThread());
        Thread thirdThread = new Thread(new SpecialThread());
        Thread fourThread = new Thread(new SpecialThread());
        Thread fiveThread = new Thread(new SpecialThread());

        list.add(firstThread);
        list.add(secondThread);
        list.add(thirdThread);
        list.add(fourThread);
        list.add(fiveThread);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
