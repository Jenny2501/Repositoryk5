package ru.geekbrains.j_one.lesson_a.online;

public class abstract Animals extends Object {
    protected String name;
    protected String color;
    protected int age;
    protected double jumpHeight;
    protected int run;

    public abstract Animals (String name, String color, int age, double jumpHeight,int run){
        this.name = name;
        this.color = color;
        this.age = age;
        this.jumpHeight = jumpHeight;
        this.run = run;
    }
    public void run() {
        System.out.println(name + " run");
    }
    public void jumpHeight(){
        System.out.println(name + jumpHeight);
    }

    public abstract void run();
    public abstract void jumpHeight();
}





