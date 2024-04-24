package controller;

public class demo implements   super2{
    @Override
    public void messagesuper() {
        System.out.println("THis message is from super1 interface");
    }

    @Override
    public void messagesub() {
        System.out.println("THis message is from super2 interface");
    }
}

class mainse{
    public static void main(String argc[]){
        demo d1 = new demo();
        d1.messagesub();
        d1.messagesuper();
    }
}
