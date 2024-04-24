package controller;

import java.util.Scanner;

public class continues {
    public static void main(String[] argc){
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs;
        int sum = 0;
        System.out.println("Enter the number of input: ");
        numberOfInputs = scanner.nextInt();

        System.out.println("Enter" + numberOfInputs + " numbers :");

        for(int i = 1; i <= numberOfInputs ; i++){
            System.out.println("ENtered number " + i + ": ");
            int number = scanner.nextInt();
            if(number < 10){
                System.out.println("Skip number");
                continue;
            }
            sum += number;
        }
        System.out.println("NUmber is " + sum);
    }
}
