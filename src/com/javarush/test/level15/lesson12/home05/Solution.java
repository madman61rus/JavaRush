package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.util.InputMismatchException;

public class Solution {

    public Solution() { }
    public Solution (Integer a) { }
    public Solution (Double db) {}

    private Solution (String str){}
    private Solution (Float fl) {}
    private Solution (Long lg) {}

    protected Solution (int i) {}
    protected Solution (String str, int i) {}
    protected Solution (Float fl, Integer i) {}

    Solution (String str, Integer io){}
    Solution (Long lg, String str) {}
    Solution (Double db, Double lt) {}

}

