package controller;

import java.util.HashMap;
import java.util.Map;

public class streammap {
    public static void main(String argc[]){
        Map<String, Integer>  ageMap = new HashMap<>();
        ageMap.put("Alice",30);
        ageMap.put("Bob",25);
        ageMap.put("Charls",35);
        ageMap.put("David",40);
        ageMap.put("Hars",26);

        ageMap.entrySet().stream()
                .filter(entry -> entry.getValue()>30)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
