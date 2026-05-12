package basics;

import java.util.Scanner;

public class PrimeChecker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            menu();
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> PrimeCheck();

                case 2 -> MultipleChecker();

                case 3 -> PrimeCounter();

                case 0 -> System.out.println("Successfully Exited");

                default -> System.out.println("Enter Valid Choice");
            }

        } while (choice != 0);

    }

    static void menu() {

        System.out.println("\n===== MENU =====");
        System.out.println("1. Check Number is Prime or Not");
        System.out.println("2. Check Multiple Prime Between Range");
        System.out.println("3. Count Prime Numbers Between Range");
        System.out.println("0. Exit");
        System.out.print("Enter Your Choice: ");
    }

    static void PrimeCheck() {

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not a Prime Number");
            return;
        }

        boolean flag = true;
        int num = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                flag = false;
                num = i;
                break;
            }
        }

        if (flag) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
            System.out.println("Because it is divisible by " + num);
        }
    }

    static void MultipleChecker() {

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a < 2) {
            a = 2;
        }

        System.out.println("Prime Numbers:");

        for (; a <= b; a++) {

            boolean flag = true;

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(a);
            }
        }
    }

    static void PrimeCounter() {

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int start = a;
        int end = b;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a < 2) {
            a = 2;
        }

        int count = 0;

        for (; a <= b; a++) {

            boolean flag = true;

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }
        }

        System.out.printf("There are %d prime numbers between %d and %d\n", count, start, end);
    }
}