package controller;

public class singleinheritance {
    int a,b,sum;
    void cal(){
        System.out.println("Super class override method");
        sum = a + b;
        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);
        System.out.println("The Sum of two number is :"+sum);
    }
}
class B extends singleinheritance{
    void cal(){
        super.cal();
        System.out.println("\n Sub class override method");
        int sub = a - b;
        System.out.println("The value of A is " +a);
        System.out.println("The value of B is " +b);
        System.out.println("The difference of two number is :"+sub);
    }
}

class main{
    public static void main(String argc[]){
        B ob =  new B();
        ob.a = 410;
        ob.b = 220;
        ob.cal();
    }
}
