package ru.geekbrains.j_one.lesson_a.online.zoo;

import ru.geekbrains.j_one.lesson_a.online.zoo.Cat1;

public class Main1 {
    public static void main (String[] args ) {
        Cat1 c = new Cat1("Mursic", "Black", 2,2,200);
        Dog1 d = new Dog1("Sharic", "White", 3,0.5, 500,10);


            Animals[] zoo = {c, d,};
            for (int i = 0; i < zoo.length; i++) {
                zoo[i].run();
                zoo[i].jumpHeight();
                d.swim();


                if (zoo[i] instanceof Dog1) {
                    ((Dog1) zoo[i]).run();
                }
            }


    }
}
