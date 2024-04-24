package controller;

public class switchcase {

    public static void main(String argc[]){
        int num = 2;
        int number = 1;
        String day;
        switch (number){
            case 1:
                day = "Monday";
                if(num == 19){
                    System.out.println("Number is 1");
                }else{
                    System.out.println("Not 1");
                }
                System.out.println("Day of the week:" + day);
                break;
            case 2:
                day = "Tuesday";
                System.out.println("Day of the week:" + day);
                break;
            case 3:
                day = "Wednesday";
                System.out.println("Day of the week:" + day);
                break;
            case 4:
                day = "Thursday";
                System.out.println("Day of the week:" + day);
                break;
            default:
                day = "Invalid day";
                System.out.println("Day of the week:" + day);
                break;
        }
//        System.out.println("Day of the week:" + day);
            String days = switch(num){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
                default -> "Invalid Choice";
            };
        System.out.println("Java 14+  version :" + days);

    }


}
