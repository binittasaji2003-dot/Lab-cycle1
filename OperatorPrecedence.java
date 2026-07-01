//Lab Cycle 1
// Task 10: Operator Precedence Evaluation
// 1/07/2026
import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        System.out.print("d = ");
        int d = sc.nextInt();

        System.out.print("e = ");
        int e = sc.nextInt();

        int result = a + b * c - d / e;

        System.out.println("Result = " + result);

        sc.close();
    }
}