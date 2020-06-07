package lesson6;

import lesson6.animals.*;

import java.util.Arrays;

public class Main {
    //private package-private protected public
    public static void main(String[] args) {
//        Cat cat= new Cat("Barsik", "red", 2);
//        cat.info();
//        cat.jump();
//        cat.meow();

//        Dog dog = new Dog("Tuzik", "white", 3);
//        dog.info();
//        dog.jump();


//        WildCat wildCat = new WildCat("Pantera", "black", 14);
//        wildCat.voice();
//
//        Cat cat= new Cat("Barsik", "red", 2);
//        Dog dog = new Dog("Tuzik", "white", 3);
//        Duck duck = new Duck("Donald","yellow", 5);
//
//        cat.voice();
//        dog.voice();
//        duck.voice();

//        Animal cat= new Cat("Barsik", "red", 2);
//        Animal dog = new Dog("Tuzik", "white", 3);
//        Animal duck = new Duck("Donald","yellow", 5);
//
//        cat.voice();
//        dog.voice();
//        duck.voice();

//        Animal[] animals = {
//                new Cat("Barsik", "red", 2),
//                new Dog("Tuzik", "white", 3),
//                new Duck("Donald","yellow", 5),
//                new WildCat("Pantera", "black", 14)
//        };
//
//        for (int i = 0; i < animals.length ; i++) {
//            animals[i].voice();
//        }


        Animal cat = new Cat("Barsik", "red", 2, 9);

//        if (cat instanceof Cat) {
//            System.out.println(((Cat) cat).getLiveCount());
//        }


        System.out.println(cat);


//        Animal[] animals = {
//                new Cat("Barsik", "red", 2, 9),
//                new Dog("Tuzik", "white", 3),
//                new Duck("Donald", "yellow", 5),
//                new WildCat("Pantera", "black", 14, 9)
//        };
//
//        for (int i = 0; i < animals.length; i++) {
//            animals[i].voice();
//            if(animals[i] instanceof Cat){
//                System.out.println(((Cat)animals[i]).getLiveCount());
//            }
//        }


    }
}
