package controller;



public class evenodd {
    public static void main(String argc[]) {
        int num = 4;
        if (num % 2 != 0) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }

        String val = "";
        if (val.equals("Hars") && val != "") {
            System.out.println("True");
        } else {
            System.out.println("false");
        }


        String vale = "Harsh";
        if (vale.length() > 5) {
            System.out.println(" Length True");
        } else {
            System.out.println(" length false");
        }

        String vales = "H a  rs  a h";

        System.out.println("Length of string" +vales.length());
        if (vales.endsWith("a")) {
            System.out.println(" Start True");
        } else {
            System.out.println(" Start false");
        }

        String values = "I am Harshith";
        if(values.startsWith("g")){
            System.out.println("Yes it Starts with I");
            if(values.endsWith("h")){
                System.out.println("End with h");
            }
        }
            else if(values.endsWith("h")){
                System.out.println("Yes its end with h");
            }
        else if(values.endsWith("a")){
            System.out.println("Yes its end with h");
        }
        else if(values.endsWith("b")){
            System.out.println("Yes its end with h");
        }
        else if(values.endsWith("c")){
            System.out.println("Yes its end with h");
        }

            else{
                System.out.println("Nothing is correct");
            }

            boolean flag = false;

            if(flag)
                System.out.println("True");
            System.out.println("False");

    }

}
