package com.javarush.test.level12.lesson12.home05;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o)
    {
        if (o instanceof Cat){
            return ((Cat) o).getName();
        }else if ( o instanceof Tiger){
            return ((Tiger) o).getName();
        }else if (o instanceof Lion){
            return ((Lion) o).getName();
        }else if (o instanceof  Bull){
            return ((Bull) o).getName();
        }else if (o instanceof Cow){
            return ((Cow) o).getName();
        }else
        {

            return ((Animal) o).getName();
        }
    }

    public static class Cat  extends Animal   //<--Классы наследуются!!
    {
        String name = "Кот" ;

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    public static class Tiger  extends Cat
    {
        String name = "Тигр" ;

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    public static class Lion  extends Cat
    {
        String name = "Лев" ;

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    public static class Bull  extends Animal
    {
        String name = "Бык" ;

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    public static class Cow  extends Animal
    {
        String name = "Корова" ;

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    public static class Animal
    {
        String name = "Животное" ;

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
    }
}
