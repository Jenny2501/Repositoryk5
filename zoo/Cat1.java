package ru.geekbrains.j_one.lesson_a.online.zoo;

import ru.geekbrains.j_one.lesson_a.online.Cat1;

public class Cat1 extends Animals {
    int run;
    double jumpHeight;


public Cat1 (String name, String color, int age, double jumpHeight,int run){
   super (name, color, age, jumpHeight,run);
}
@override
public void jumpHeight(){
    System.out.println(name + "jump on"+jumpHeight+"meters");
}
public void run() {
    System.out.println(name + "run"+run+"meters");
}

    }

public class Cat1 extends Animals {
    @Override
    public void run() {
        System.out.println("Кот пробежал");
    }
}