package controller;

public class mult {
    protected int x,y;
    public void read(int a ,int b){
        x=a;
        y=b;
    }
}
class  H extends mult{
    private int res;
    public void sum(){
        res = x + y;
        System.out.println("THe sum is res:" +res);
    }
}

class  I extends H{
    void display(){
        System.out.println("The Value x is:" +x);
        System.out.println("The Value y is:" +y);
    }
}

class mains{
    public static void main(String argc[]){
        I ob = new I();
        ob.read(10,5);
        ob.display();
        ob.sum();
    }
}


