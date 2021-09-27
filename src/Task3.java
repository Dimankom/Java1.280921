import java.util.Scanner;

// Урок 1, задание 3
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите коэффициенты a, b, c, d");
        Scanner in = new Scanner(System.in);
        float a = in.nextInt();
        float b = in.nextInt();
        float c = in.nextInt();
        float d = in.nextInt();
        double expression = a * (b + (c / d));
        if (expression < 0) {
            System.out.println("Отрицательный ответ = " + expression);
        } else if (expression == 0) {
            System.out.println("Ответ равен 0");
        } else {
            System.out.println(" Положительный результат = " + expression);
        }
    }
}

