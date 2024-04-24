package controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream1 {
    public static void main(String rgc[]){
        List<String> names = Arrays.asList("Alice","Bob,","Charlse","David","Evn");
        List<String> filteredName = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Names start with A" + filteredName);
    }
}
