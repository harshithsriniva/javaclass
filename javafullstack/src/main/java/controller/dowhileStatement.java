package controller;

import java.util.Scanner;

public class dowhileStatement {
    public static void main(String[] argc){
        Scanner scanner = new Scanner(System.in);
        int number;

        do{
            System.out.println("Enter a anumber greater than 5: ");
            number = scanner.nextInt();
        }while (number <= 5);
        System.out.println(" entered number : " + number);
        scanner.close();
    }
}
