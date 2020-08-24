package ru.geekbrains.j_one.lesson_a.online.zoo;

import ru.geekbrains.j_one.lesson_a.online.Animals;

        public  class Dog1 extends Animals {
            double jumpHeight;
            int run;
            int swim;

            public Dog1 (String name, String color, int age, double jumpHeight,int run,int swim){
                super (name,color,age, jumpHeight,run);
                this.swim = swim;

            }
            @override
            public void jumpHeight (){
                System.out.println(name + "jump on"+jumpHeight+"meters");
            }
            public void swim(){
                System.out.println(name + "swim"+swim+"meters");
            }

            public void run (){
                System.out.println(name + "run"+run+"meters");
            }
        }


