package controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class setmap {
    public static void main(String argc[]){
        Set<Map<String,Integer>> setOfMap = new HashSet<>();
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("C",3);
        map2.put("D",4);
        setOfMap.add(map1);
        setOfMap.add(map2);

        setOfMap.stream()
                .flatMap(map->map.entrySet().stream())
                .filter(entry -> entry.getValue()>2)
                .forEach(System.out::println);

    }
}
