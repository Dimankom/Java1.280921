package homework;

import java.util.Scanner;

public class HomeWorkLesson1 {

    public static void main(String[] args) {
//        Переменные.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.nextLine();
        System.out.println("Введите числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int digit = in.nextInt();
        System.out.println("Введите год");
        int year = in.nextInt();

//        ******
        visacosYearStatus(year);
        printStatus(digit);
        writeName(name);
        System.out.println("Решение задачи №3:");
        System.out.println(summa(a, b, c, d));

        System.out.println("Решение задачи №4:");
        System.out.println(sumControl(a, b));

        System.out.println("Решение задачи №6:");
        System.out.println(trueOrFalse(a));


        // Задание 2.
        byte byteVar = 127;
        short shortVar = 30000;
        int intVar = (int) 2e9;
        long longVar = (long) 2e15;
        float floatVar = 212.2342342f;
        double doubleVar = 323.23423324234343;
        char charVar = '*';
        boolean boliVar = true;
    }

    //        Эаданик 3.
    public static float summa(float a, float b, float c, float d) {
        float e = a * (b + (c / d));
        return e;
    }


    //        Задание 4. Тип данных - boolean
    public static boolean sumControl(int a, int b) {
        int summ = a + b;
        if (summ >= 10) {
            if (summ <= 20) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Задание 5. Метод должен иметь тип данных void
    public static void printStatus(int digit) {
        if (digit <= 0) {
            System.out.println("Число " + digit + " отрицательное");
        } else {
            System.out.println("Число " + digit + " положительное");
        }
    }

    //        Задание 6. Тип данных boolean
    public static boolean trueOrFalse(int a) {
        if (a <= 0) {
            return true;
        } else {
            return false;
        }
    }

    //    Задание 7. Строка Имя.
    public static void writeName(String name) {
        System.out.println("Привет, " + name + " !");
    }

    //    Задание 8. Високосный год. Остатки от деления на 4, 100, 400.
    public static void visacosYearStatus(int year) {
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}