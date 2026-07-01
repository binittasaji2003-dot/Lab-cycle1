//Lab Cycle 1
// Task 11: Check Even or Odd
// 1/07/2026
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        sc.close();
    }
}
