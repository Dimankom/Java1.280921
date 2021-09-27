import java.util.Scanner;

public class Conditions {
    // управляющие конструкции if или switch
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x > 100) {
            System.out.println("Больше 100");
        } else if (x > 10) {
            System.out.println("Больше 10");
        } else if (x > 0) {
            System.out.println(" До 10");
        } else {
            System.out.println(" x отрицательный");
        }
    }

}
