package basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("Enter Your Choice");
            menu();
            choice = sc.nextInt();
            switch (choice){
                case 1-> factorial();
                case 2-> {
                    System.out.println("ENter Your Number");
                    int n = sc.nextInt();
                    BigInteger fact =RecursiveFactorial(n) ;
                    System.out.println("Factorial of "+n+" is :-"+fact);
                }
                case 3-> MultipleFactorial();
                case 0 -> System.out.println("Successfully Exited");
                default -> System.out.println("Enter Valid Choice");
            }
        }while (choice!=0);
    }
    private static void menu(){
        System.out.println("1. Check Factorial");
        System.out.println("2. Factorial Using Recursion");
        System.out.println("3. Check Multiple Factorial Between Ranges");
        System.out.println("0. Exist");
    }

    private static void MultipleFactorial() {
        System.out.println("Enter the Starting Of Range");
        int s = sc.nextInt();
        System.out.println("Enter the ending of Range");
        int e= sc.nextInt();
        if(s>e){
           int temp =s;
           s=e;
           e=temp;
        }
        System.out.printf("Factorial between %d and %d are \n",s,e);
        for(;s<=e;s++){
            BigInteger fact= RecursiveFactorial(s) ;
            System.out.println("Factorial of "+s+" is :-"+fact);
        }
    }

    private static BigInteger RecursiveFactorial(int n) {
        if(n < 0){
            System.out.println("Factorial does not exist");
            return BigInteger.ZERO;
        }
        if (n==1 || n==0) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(RecursiveFactorial(n-1));
    }

    private static void factorial() {

        System.out.println("Enter Your Number");

        int n = sc.nextInt();

        int num = n;
        if (n < 0) {
            System.out.println("Factorial does not exist");
            return;
        }

        BigInteger fact = BigInteger.ONE;

        for (; n > 1; n--) {
            fact = fact.multiply(BigInteger.valueOf(n));
        }

        System.out.println("Factorial of " + num + " is :- " + fact);
    }
}
