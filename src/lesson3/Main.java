package lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Класс в котором показываю примеры на 3-м уроке
 *
 * @author Кусяпкулов Фанзиль
 */

public class Main {
    static Scanner sc;
    static Random random;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();

//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        System.out.printf("%d + %d = %d\n", x, y, x + y);

//        sc.nextLine();
//        String name = sc.nextLine();
//        System.out.printf("Hello %s, how are you? ", name);


//        System.out.printf("float: %+10.2f int: %d String: %10s\n", 1.2345f, 123, "Java");


//        int x = random.nextInt(21) + 100;
////        int y = random.nextInt(10)+50;
//        int y = (int) (Math.random() * 10 + 50);
//
//
//        System.out.printf("%d + %d = %d\n", x, y, x + y);
//
//        someThink(5);


//        gamePassword();

        int[] arr = {3, 7, 12, 6, 5, 3, 2, 6, 7, 1};
//        System.out.println(countMoreNumber(arr, 10));


//        print2dArr( factoryArr2dFillRandom(5, 100) );

//        System.out.println(sum(3, 4));
//        System.out.println(sum(2, 5, 4));
//        System.out.println(sum(1, 5, 4));


//        String[] words = "java core int float byte".split(" ");
//
//        for (String word : words) {
//            System.out.println(word);
//        }

        Integer.parseInt("1");


    }

    static int sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

//    static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int[][] factoryArr2dFillRandom(int n, int max) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(max);
            }
        }
        return arr;
    }

    static void print2dArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    static int countMoreNumber(int[] arr, int n) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                k++;
            }
        }
        return k;
    }


    static void gamePassword() {
        String pass = "12345";
        String userPass;
        do {
            System.out.println("Введите пароль");
            userPass = sc.nextLine();
        } while (!pass.equals(userPass));

        System.out.println("Пароль верный, можете продолжить работу");
    }

    /**
     * Метод который что то делает
     *
     * @param x параметр, который просто распечатывается     *
     */
    static void someThink(int x) {
        System.out.println(x);
    }
}
