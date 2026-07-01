//Lab Cycle 1
// Average Calculator (Task 3: Find and Correct Errors)
// 1/07/2026
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("Average = " + average);

        sc.close();
    }
}