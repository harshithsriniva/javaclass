package controller;

public class casting {
    public static void main(String argc[]){
        int numbers = 100;
        byte byteValue = (byte) numbers;
        System.out.println("Byte value: " + byteValue);

        float floatValue = (float) numbers;
        System.out.println("float value: " + floatValue);

        double doubleValue = (double) numbers;
        System.out.println("double value: " + doubleValue);

        int a,b,c;
        a = b = c =10;
        System.out.println("A"+a);
        System.out.println("B"+b);
        System.out.println("C"+c);

        int count  = 5;
        count += 2;
        count -= 3;
        System.out.println("Count"+count);

        String message = "Hello";
        message += "World";
        System.out.println("message"+message);

        int[] array = new int[5];
        array[0] = 10;
        array[1] = 25;
        array[4] = 30;
        System.out.println("array[0] "+array[0]);
        System.out.println("array[1] "+array[1]);
        System.out.println("array[5] "+array[5]);
    }
}
