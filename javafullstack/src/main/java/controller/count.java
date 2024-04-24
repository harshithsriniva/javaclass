package controller;

import java.util.Arrays;
import java.util.List;

public class count {
    public static void main(String argc[]){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98);
        long count = myList.stream()
                .count();
        System.out.println(count);
    }
}
