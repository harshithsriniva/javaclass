package controller;

public class datetime {
    public static void main(String argc[]){
        System.out.println("Current Local Date: " + java.time.LocalDate.now());
        System.out.println("Current Local TIme: " + java.time.LocalTime.now());
        System.out.println("Current Date and Time: " + java.time.LocalDateTime.now());
    }
}
