package controller;

import java.util.*;

public class duplicate {
    public static void main(String argc[]){
        List<Integer> myList =  Arrays.asList(10,10,15,8,49,25,98,32,15);
        Set<Integer> set = new HashSet<>();
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
    }
}
