package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    static ArrayList<String> history = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int choice;
        do {
            menu();
            choice = sc.nextInt();
               switch (choice){

                   case 1 -> calculator("+");
                   case 2 -> calculator("-");
                   case 3 -> calculator("*");
                   case 4 -> calculator("/");
                   case 5 -> calculator("%");
                   case 6 -> printHistory();

                   case 0 -> System.out.println("Calculator Closed");
                   default -> System.out.println("invalid Choice");

               }
        }while (choice!=0);

    }

    static void printHistory() {
        for (String st:history){
            System.out.println(st);
        }
    }

    static void menu(){
        System.out.println("\n===== Calculator =====");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. History");
        System.out.println("0. Exit");
    }

    static void calculator(String ope){
        System.out.print("Enter first Number:-");
        double a= sc.nextDouble();
        System.out.print("Enter second Number:-");
        double b=sc.nextDouble();
        double ans;
        switch (ope){
            case "+" -> {
                System.out.println("Answer = " + (a + b));
                history.add(a+" + " + b +" = "+ (a + b));
            }
            case "-"->{
                System.out.println("Answer = " + (a - b));
                history.add(a+" - "+b+" = "+(a - b)  );
            }case "*"->{
                System.out.println("Answer = " + (a * b));
                history.add(a + " * "+ b+" = "+(a * b)  );
            }case "/"->{
                if(b==0){
                    System.out.println("cannot divide by zero");
                    history.add(a + " / "+ b+" = Cannot divide by zero"  );
                }
                else  {
                    System.out.println("Answer = " + (a / b));
                    history.add(a + " / "+ b + " = " + (a / b) );
                }
            }case "%"->{
                System.out.println("Answer = " + (a % b));
                history.add(a + " % "+ b+" = " +(a % b)  );
            }

        }

    }
}
