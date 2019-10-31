
import java.util.Scanner;

public class ptBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given equation as 'a*x+b=0', Please enter constants:");
        double a, b;
        System.out.println("Enter a :");
        a = sc.nextDouble();

        System.out.println("Enter b :");
        b = sc.nextDouble();

        if (a != 0) {
            double solution = (-b / a);
            System.out.printf("The  is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all !");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
