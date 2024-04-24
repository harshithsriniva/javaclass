package controller;

public class stringimutable {
    public static void main(String[] argc){
        String original = "Hello";
        int sum = 5 + 6;
        String modify = original + "word";

        System.out.println("Original String: " + original);

        System.out.println("Modified String: " + modify);

       String data =  original.concat("!");
        System.out.println("Data String: " + data);
        System.out.println("Original String: " + original);
    }
}
