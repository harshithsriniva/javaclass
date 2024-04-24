package controller;

public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("Age cannot be negitive");
        }

    }

    public static void main(String[] argc){
        Encapsulation obj =  new Encapsulation();
        obj.setName("Harshith");
        obj.setAge(30);
        System.out.println("Name: " +obj.getName());
        System.out.println("age: " +obj.getAge());
        obj.setAge(-5);
    }
}
