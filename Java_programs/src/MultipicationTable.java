//Lab Cycle 1
// Task 14: Display Multiplication Table
// 1/07/2026
import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}