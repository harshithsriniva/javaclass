package controller;

public class buffer {
    public static void main(String[] args){
        StringBuffer s1 = new StringBuffer("HAR");
        System.out.println("The original string buffer s1 is : " +s1);
        s1.append("World");
        System.out.println("The Append string buffer s1 is : " +s1);
        s1.insert(2,",");
        System.out.println("The Insert string buffer s1 is : " +s1);
        int len = s1.length();
        System.out.println("The Length string buffer s1 is : " +len);
        s1.setLength(3);
        System.out.println("The set length string buffer s1 is : " +s1);
    }
}
