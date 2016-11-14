package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human childOne = new Human();
        Human childTwo = new Human();
        Human childThree = new Human();

        childOne.name = "Melisa";
        childOne.age = 10;
        childOne.sex = false;

        childTwo.name = "Ted";
        childTwo.age = 15;
        childTwo.sex = true;

        childThree.name = "Victor";
        childThree.age = 20;
        childThree.sex = true;

        Human fother = new Human();
        Human mother = new Human();

        fother.name = "William";
        fother.age = 40;
        fother.sex = true;
        fother.children.add(childOne);
        fother.children.add(childTwo);
        fother.children.add(childThree);

        mother.name = "Teresa";
        mother.age = 33;
        mother.sex = false;
        mother.children.add(childOne);
        mother.children.add(childTwo);
        mother.children.add(childThree);

        Human grandFotherOne = new Human();
        Human grandFotherTwo = new Human();

        grandFotherOne.name = "Den";
        grandFotherOne.age = 70;
        grandFotherOne.sex = true;
        grandFotherOne.children.add(fother);

        grandFotherTwo.name = "Igor";
        grandFotherTwo.age = 65;
        grandFotherTwo.sex = true;
        grandFotherTwo.children.add(mother);

        Human grandMotherOne = new Human();
        Human grandMotherTwo = new Human();

        grandMotherOne.name = "Iren";
        grandMotherOne.age = 50;
        grandMotherOne.sex = false;
        grandMotherOne.children.add(fother);

        grandMotherTwo.name = "Maria";
        grandMotherTwo.age = 65;
        grandMotherTwo.sex = false;
        grandMotherTwo.children.add(mother);

        System.out.println(grandFotherOne);
        System.out.println(grandFotherTwo);
        System.out.println(grandMotherOne);
        System.out.println(grandMotherTwo);
        System.out.println(fother);
        System.out.println(mother);
        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childThree);

    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
