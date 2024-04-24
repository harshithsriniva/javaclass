package controller;

public class mulitthread implements Runnable{
    public void run(){
        for(int i =0 ;i<5;i++){
            System.out.println(" THread A: i = "+i);
        }
    }
}
 class BE implements Runnable{
    public void run(){
        for(int j =0 ;j<5;j++){
            System.out.println("Thread B :j = "+j);
        }
    }
}

class mainsee{
    public static void main(String argd[]){
        mulitthread ob1 =new mulitthread();
        BE ob2 = new BE();
        Thread thi1 = new Thread(ob1);

        Thread thi2 = new Thread(ob2);
        thi1.start();
        thi2.start();
    }
}
