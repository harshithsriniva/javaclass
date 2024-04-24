package controller;

import java.util.List;

import static controller.randomwhile.generateRandomNumber;

public class accessSpecifier {
    public static void main(String[]  argc){
        List<Integer> numbers = generateRandomNumber(5);
        System.out.println("Randome number : " +numbers);
    }
}
