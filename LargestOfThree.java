//Lab Cycle 1
// Task 13: Find Largest of Three Numbers
// 1/07/2026

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("C = ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } else {
            System.out.println("Largest = " + c);
        }

        sc.close();
    }
}