package com.javarush.test.level12.lesson02.task04;

/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/

public class Solution
{
    public static void main(String[] args)
    {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o)
    {
        if (o instanceof Cat){
           ((Cat) o).getMyClass();
        }else if (o instanceof Dog){
            ((Dog) o).getMyClass();
        }else if (o instanceof Bird){
            ((Bird) o).getMyClass();
        }else {
            ((Lamp) o).getMyClass();
        }


    }

    public static class Cat
    {
        public void getMyClass(){
            System.out.println("Кошка") ;
        }
    }

    public static class Dog
    {
        public void getMyClass(){
            System.out.println("Собака") ;
        }
    }

    public static class Bird
    {
        public void getMyClass(){
            System.out.println("Птица") ;
        }
    }

    public static class Lamp
    {
        public void getMyClass(){
            System.out.println("Лампа") ;
        }
    }
}
