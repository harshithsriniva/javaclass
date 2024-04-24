package controller;

public class AreaMain {
    public static void main(String[] argc){
        rectangle re =new rectangle(5,2);
        circle ci =  new circle(3);
        System.out.println("Area of rectangle is : " +re.area());
        System.out.println("Area of circle is : " +ci.area());
    }
}
