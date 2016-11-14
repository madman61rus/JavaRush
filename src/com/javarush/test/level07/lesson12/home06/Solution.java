package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFatherOne = new Human() ;
        grandFatherOne.name = "Василий";
        grandFatherOne.age = 60;
        grandFatherOne.sex = true;

        Human grandFatherTwo = new Human() ;
        grandFatherTwo.name = "Иван";
        grandFatherTwo.age = 70;
        grandFatherTwo.sex = true;

        Human grandMotherOne = new Human();
        grandMotherOne.name = "Василиса";
        grandMotherOne.age = 65;
        grandMotherOne.sex = false;

        Human grandMotherTwo = new Human();
        grandMotherTwo.name = "Катя";
        grandMotherTwo.age = 45;
        grandMotherTwo.sex =false;

        Human father = new Human();
        father.name = "Коля";
        father.age = 36;
        father.sex = true;
        father.father= grandFatherOne;
        father.mother = grandMotherOne;

        Human mother = new Human();
        mother.name ="Света";
        mother.age = 32;
        mother.sex = false;
        mother.mother = grandMotherTwo;
        mother.father = grandFatherTwo;

        Human childOne = new Human();
        childOne.name = "Ира";
        childOne.age=10;
        childOne.sex =false;
        childOne.father = father;
        childOne.mother = mother;

        Human childTwo = new Human();
        childTwo.name = "Вова";
        childTwo.age=14;
        childTwo.sex =true;
        childTwo.father = father;
        childTwo.mother = mother;

        Human childThree = new Human();
        childThree.name = "Катя";
        childThree.age=11;
        childThree.sex =false;
        childThree.father = father;
        childThree.mother = mother;

        System.out.println(grandFatherOne);
        System.out.println(grandFatherTwo);
        System.out.println(grandMotherOne);
        System.out.println(grandMotherTwo);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childThree);

    }

    public static class Human
    {
        String name;
        int age;
        Boolean sex;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
