import java.util.Scanner;

public class SqrtEqation {
//    Это класс, который будет решать квадратные уравнения.
public static void main(String[] args) {
    System.out.println("Введите коэффициенты a, b, c");
    Scanner in = new Scanner(System.in);
    double a = in.nextInt();int b = in.nextInt(); int c = in.nextInt();
    double discriminant = b * b - 4 *a *c;
    if (discriminant <0) {
        System.out.println("Решений нет");
    }else  if (discriminant == 0 ){
        System.out.println("Единственный корень x= "+ (-b / (2*a)));
    } else {
        System.out.println(" Два корня");
        double x1 = (-b -Math.sqrt(discriminant)) / (2*a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2*a);
        System.out.println(" x1 = " + x1);
        System.out.println(" x2 = " + x2);
    }
}
}
