package com.javarush.test.level12.lesson12.home04;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «хз».
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o)
    {
        if (o instanceof Cat){
            return ((Cat) o).getType();
        }else if (o instanceof Tiger){
            return ((Tiger) o).getType();
    }else if(o instanceof Lion){
            return( (Lion) o).getType();
        }else if (o instanceof Bull){
            return((Bull) o).getType();
        }else
        {

            return "хз";
        }
    }

    public static class Cat
    {
        public String getType(){
            return "Кот" ;
        }
    }

    public static class Tiger
    {
        public String getType(){
            return "Тигр" ;
        }
    }

    public static class Lion
    {
        public String getType(){
            return "Лев" ;
        }
    }

    public static class Bull
    {
        public String getType(){
            return "Бык" ;
        }
    }

    public static class Pig
    {
        public String getType(){
            return "Свинья" ;
        }
    }
}
