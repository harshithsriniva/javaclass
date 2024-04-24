package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class randomwhile {
    public static void main(String[] argc){
        List<Integer> numbers = generateRandomNumber(5);
        System.out.println("Original List: " + numbers);

        int index = 0;
        while(index < numbers.size()){
            if(numbers.get(index) % 2 != 0){
                numbers.remove(index);
            }else{
                index++;
            }
        }
        System.out.println("List  after remove odd number: " + numbers );
    }
    public static List<Integer> generateRandomNumber(int count){
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < count ; i++){
            numbers.add(random.nextInt(1000));
        }
        return numbers;
    }
}
