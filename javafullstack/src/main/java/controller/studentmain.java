package controller;

import java.util.HashMap;
import java.util.Map;

public class studentmain {
    public static void main(String[] argc){
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("HArshith",new Student("Harshith",95,"123 MAin","9745319113","cityA"));
        studentMap.put("Palavi",new Student("PAlavi",96,"124 MAin","9745319133","cityA"));
        studentMap.put("Shakthi",new Student("Shakthi",97,"125 MAin","974531113","cityA"));
        studentMap.put("Sathya",new Student("Sathya",98,"126 MAin","97453193","cityA"));

        studentMap.forEach((name,student)->{
            System.out.println("Name : " + student.getName());
            System.out.println("Score : " + student.getScore());
            System.out.println("Address : " + student.getAddress());
            System.out.println("Phone No : " + student.getPhoneNumber());
            System.out.println("City :" + student.getCity());
            System.out.println();
        });

        Student stud = studentMap.get("Palavi");
        System.out.println("Pallavi :" + stud.getPhoneNumber());
        System.out.println("Pallavi :" + stud.getAddress());
    }
}
