package controller;



public class user {
    public static void main(String args[]){
        float x = 5.1f,y=1000.1f;
        try{
            float z = x/y;
            if(z<0.01){
                throw new myexception("Number is very small pleas give proper number");
            }
            System.out.println("Value of z = " + z);
        }catch (myexception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Final block execute whether excepton occure or not");
        }
    }
}
