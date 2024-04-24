package controller;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class oddoreven {
    public static void main(String argc[]){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Set<Integer> evenNumber = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("The Even Number is : " +evenNumber);
    }
}
