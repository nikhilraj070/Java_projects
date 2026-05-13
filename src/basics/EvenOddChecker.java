package basics;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddChecker {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.println("Enter Your Choice");
            choice =sc.nextInt();
            switch (choice) {
                case 1 -> EvenOddCheck();
                case 2 -> CheckMultipleEvenOdd();
                case 3 -> CheckBetweenRange();
                case 4 -> TotalEvenOdd();
                case 5 -> DisplayHistory();
                case 6 -> SaveToFile();
                default -> System.out.println("Enter Valid Choice");
            }
        } while (choice != 0);
    }

    static void menu() {

        System.out.println("\n===== Even Odd Checker =====");

        System.out.println("1. Check Even or Odd");
        System.out.println("2. Check Multiple Numbers");
        System.out.println("3. Check Between Range");
        System.out.println("4. Count Total Even and Odd");
        System.out.println("5. Display History");
        System.out.println("6. Save History To File");
        System.out.println("0. Exit");

        System.out.println("============================");
    }

    private static void SaveToFile() {
        try{
            System.out.println("Enter the File Name");
            String file = sc.next();
            FileWriter f= new FileWriter(file);
            for(String st:history){
                f.write(st + "\n");
            }f.write("\n");
            f.close();
            System.out.println("successfully written in file");
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void DisplayHistory() {
        if(history.isEmpty()){
            System.out.println("Your history in empty");
            return;
        }
        for(String st :history){
            System.out.println(st);
        }
    }

    private static void CheckBetweenRange() {
        System.out.println("Enter the Starting Number");
        int s = sc.nextInt();
        System.out.println("Enter the last number");
        int e = sc.nextInt();
        if (s > e) {
            int temp = s;
            s = e;
            e = temp;
        }
        for (; s <= e; s++) {
            if ((s & 1) == 1) {
                System.out.printf("%d is odd Number \n", s);
                history.add(s + " is Odd number");
            } else {
                System.out.printf("%d is Even Number \n", s);
                history.add(s + " is Even number");
            }
        }
    }

    private static void TotalEvenOdd() {
        System.out.println("Enter the Starting Number");
        int s = sc.nextInt();
        System.out.println("Enter the last number");
        int e = sc.nextInt();
        int even = 0, odd = 0;
        if (s > e) {
            int temp = s;
            s = e;
            e = temp;
        }
        int start = s;
        int end = e;
        for (; start <= end; start++) {
            if ((start & 1) == 1) {
                odd++;
            } else {
                even++;
            }
        }
        System.out.printf("There are %d even and %d odd between %d and %d \n", even, odd, s, e);
        history.add(String.format("There are %d even and %d odd between %d and %d", even, odd, s, e));
    }

    private static void CheckMultipleEvenOdd() {
        System.out.println("How Many Number You Want to Check");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            EvenOddCheck();
        }
    }

    static void EvenOddCheck() {
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.printf("%d is odd Number \n", num);
            history.add(num + " is Odd number");
        } else {
            System.out.printf("%d is Even Number \n", num);
            history.add(num + " is Even number");
        }
    }

}
