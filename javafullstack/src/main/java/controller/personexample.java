package controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class personexample {
    public static void main(String argc[]){
        List<Persons> people = Arrays.asList(
                new Persons("Alice",30),
                new Persons("Bob",25),
                new Persons("Charlie",40),
                new Persons("Hars",35),
                new Persons("Dam",29));
        List<String> names =  people.stream()
                .filter(persons -> persons .getAge()>30)
                .map(Persons::getName)
                .collect(Collectors.toList());

        System.out.println("People older then 30 : " + names);
    }
}
