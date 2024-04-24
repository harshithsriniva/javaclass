package controller;

public class trycatch {
    public static void main(String argc[]){
        int a = 10,b=5,c=5,x,y;
        boolean flag = false;
        try{
            if(!flag){
                x = a/(b-c);
                System.out.println("X" +x);
            }
        }catch (Exception e){
            System.out.println("Divisible by zero exception: " +e);
        }
        y = a/(b+c);
        System.out.println("Y=" +y);
    }
}
