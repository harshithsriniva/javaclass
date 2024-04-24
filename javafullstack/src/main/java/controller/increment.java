package controller;

public class increment {
    public static void main(String argc[]){
        int A = 5;
        int result = A++;
        System.out.println("A = "+result);

        int B = 5;
        int Be = ++B;
        System.out.println("B = "+Be);

        int X = 5;
        int Y = X++;
        System.out.println("Y = "+Y);
        System.out.println("X = "+X);

        int H = 5;
        int a = ++H;
        System.out.println("a = "+a);
        System.out.println("H = "+H);

        int[] array = {1,2,3};
        int index = 1;
        int value = array[index++];
        System.out.println("Value = "+value);

        int[] numbers = {1,2,3};
        int idx  = 0;
        int val = ++numbers[idx];
        System.out.println("val = "+val);

        int i = 5;
        int result1 = i++ + ++i;
        System.out.println("result1 = "+result1);

        int j = 6;
        int result2 = ++j + j++;
        System.out.println("result2 = "+result2);

    }
}
