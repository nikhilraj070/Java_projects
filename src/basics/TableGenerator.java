package basics;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TableGenerator {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> table =new ArrayList<>();
    public static void main(String[] args) {
         int choice;

         do{
             menu();
             choice = sc.nextInt();
             switch (choice){
                 case 1 -> SingleTable();
                 case 2 -> MultipleTable();
                 case 3 -> SaveToFile();
                 case 0 -> System.out.println("Exist");
                 default -> System.out.println("Enter Valid Choice");
             }
         }while(choice!=0);
    }
    static void menu(){
        System.out.println("Table Printing");
        System.out.println("1. Single Table");
        System.out.println("2. Multiple Table");
        System.out.println("3. Save Table To Files");
        System.out.println("0. Exist");
    }
    static void SingleTable(){
        System.out.println("Enter the number for table");
        int n=sc.nextInt();
        for(int i=0; i<=10; i++) {
            String line = n + " * " + i + " = " + (n * i);
            System.out.println(line);
            table.add(line);
        }
    }
    static void MultipleTable(){
        System.out.println("You need to enter range");
        System.out.println("Enter the first number:-");
        int s =sc.nextInt();
        System.out.println("Enter the last number");
        int e = sc.nextInt();
        if(s>=e){
            System.out.println("second value must be greater than first value");
            return;
        }
        for (;s<=e;s++){
            for(int i=0; i<=10; i++) {
                String line = s + " * " + i + " = " + (s * i);
                System.out.println(line);
                table.add(line);
            }
            System.out.println();
        }



    }
    static void SaveToFile(){
        try {
            System.out.println("Enter the file Name");
            sc.nextLine();
            String file = sc.nextLine();

            FileWriter f=new FileWriter(file);
            for(String st : table){
                f.write(st + "\n");

            }f.write("\n");
                f.close();
                System.out.println("successfully written in file");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
