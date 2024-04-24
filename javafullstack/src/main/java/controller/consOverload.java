package controller;

public class consOverload {
    int length;
    int breadth;

//    Default constructor
    public consOverload(){
        length = 0;
        breadth = 0;
    }
    public consOverload(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public consOverload(int x){
        length = breadth = x;
    }

    void display(){
        System.out.println("length of the room : " +this.length);
        System.out.println("breadth of the room : " +this.breadth);
    }
}
