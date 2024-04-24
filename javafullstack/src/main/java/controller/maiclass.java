package controller;

public class maiclass {
    public static void main(String[]  argc){
        consOverload obj = new consOverload();
        consOverload obj1 = new consOverload(10,20);
        consOverload obj2 = new consOverload(5);
        obj.display();
        obj1.display();
        obj2.display();

    }
}
