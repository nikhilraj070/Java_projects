package basics;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n = r.nextInt(100) + 1;
        int choice,attempt=0;
        System.out.println("WELCOME TO NUMBER GUESSING GAME \nGUESS THE NUMBER");
        do {
             choice = sc.nextInt();
            attempt++;
             if(choice == n){
                 System.out.println("Congrants you guessed the correct number in "+attempt+" attempt .");
             } else if (choice > n) {
                 System.out.println("Guess smaller number");
             }
             else{
                 System.out.println("Guess bigger Number");
             }
        }while (choice!=n);
        sc.close();

    }
}
