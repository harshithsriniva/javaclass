package controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class findfirst {
    public static void main(String argc[]){
        List<Integer> myList = Arrays.asList(10,15,8,49,25);

        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
