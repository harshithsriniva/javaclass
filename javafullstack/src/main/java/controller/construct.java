package controller;

public class construct {
    int len;
    int width;

    public construct(int len, int width) {
        this.len = len;
        this.width = width;
    }
    int area(){
        return  this.len*this.width;
    }

    public static void main(String[] argc){
        construct ob1 = new construct(3,3);
        System.out.println("Area: " + ob1.area());
    }
}
