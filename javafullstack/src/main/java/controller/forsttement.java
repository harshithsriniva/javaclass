package controller;

import java.util.*;

public class forsttement {
    public static void main(String argc[]){
//        for(int i = 5 ; i <=  10; i++){
//            System.out.println(i);
//        }

//        int[] numbers = {1,2,3,4,5};
//        for(int i = 0; i <= numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

//        int[] data = {10,20,30,40,50};
//        for(int num : data){
//            System.out.println(num);
//        }

        List<String> names = Arrays.asList("Harshith","Pallavi","Shakthi","Sathy");
//        for(String name : names){
//            System.out.println("Using Collection " +name);
//        }

//        for(int i =0; i <= 2;i++){
//            System.out.println("Using Collection " + names.get(i));
//        }
//        Set<Integer> numberSet = new HashSet<>();
//        numberSet.add(1);
//        numberSet.add(2);
//        numberSet.add(3);
//
//        for(int num: numberSet){
//            System.out.println("number Set" + num);
//        }

        Map<String, Integer> studentScore = new HashMap<>();
        studentScore.put("Harshith",90);
        studentScore.put("Pallavi",95);
        studentScore.put("Sathya",90);
        studentScore.put("Shakthi",95);
        for(Map.Entry<String, Integer> entry : studentScore.entrySet()){
           System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
