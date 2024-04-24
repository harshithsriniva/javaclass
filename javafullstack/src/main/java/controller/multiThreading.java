package controller;

public class multiThreading {
    static class MyThread extends Thread{
        private volatile boolean running = true;
        public void run(){
            while (running){
                System.out.println("Thread 1 is running");
                try{
                    Thread.sleep(1000);
                    System.out.println("After 1 sec");
                }catch (InterruptedException e){
                    System.out.println("Thread 1 is intrupted");
                    return;
                }
            }
            System.out.println("THread one is stopped");
        }
        public void stopThread(){
            running = false;
        }
    }
    public static void main(String[] agc){
        MyThread thread1 = new MyThread();
        thread1.start();

        try{
            Thread.sleep(5000);
            System.out.println("After 5 sec");
            thread1.stopThread();
            System.out.println("Thread is stop");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread1.interrupt();

        try {
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("THread 1 is finished exicution");
    }

}
