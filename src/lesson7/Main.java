package lesson7;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box("red", 8);
//        Box box2 = new Box("red", 8);
//
//        if (box1.equals(box2)) {
//            System.out.println("equals");
//        } else {
//            System.out.println("no equals");
//        }
//
//        System.out.println(box1);
//        System.out.println(box2);

//        String s1 = "java";
//        String s2 = "java";
//        String s3 = new String("java");
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//
//        s1 = s1+1;
//        System.out.println(s1 == s2);


//        for (int i = 0; i < 1000000; i++) {
//            s1 += "1";
//        }

//        StringBuilder sb = new StringBuilder("java");
//
////        for (int i = 0; i < 1000000; i++) {
////            sb.append("1");
////        }
//
//        sb.append(1).append(2).append(3);
//        sb.insert(0, "Super ");
//        sb.setLength(sb.length() - 3);
////        sb.delete(2,4);
//        sb.replace(6,8,"tttt");
//        System.out.println(sb);


//        Integer x = 128; //-128..127
//        Integer y = 128;
//
//        System.out.println(x == y);
//        System.out.println(x.equals(y));



//        Cat cat = new Cat("Bars");
//        Plate plate = new Plate(100);
//
//        cat.eat(plate);
//
//        plate.info();


//        Cat cat = new Cat("Barsik");
//        Dog dog = new Dog("Tuzik");
//        dog.gav(cat);

        Cat[] cats = {
                new Cat("a"),
                new Cat("b",25),
                new Cat("c", 40),
                new Cat("d"),
                new Cat("e"),
        };

        Plate plate = new Plate(35);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }




    }
}
