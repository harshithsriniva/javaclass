package controller;

import java.util.Locale;

public class stringfunction {
    public static void main(String[] argc){
        String str = "HARS";
        String Str1 = "Harsh";
        String Str2 = "   arsh   ";
        int x = str.length();
        System.out.println("String length is : " +x);
        String y = str + Str1;
        System.out.println("String Concat is : " +y);
        String z = str + ":" + Str1;
        System.out.println("String Concat with coln is : " +z);

        String A = str.toLowerCase();
        System.out.println("String conver to lower case is : " +A);

        String B = str.toUpperCase();
        System.out.println("String conver to Upper case is : " +B);

        String C =  str.substring(3);
        System.out.println("String Sub string is : " +C);

        String D = str.replace('S','A');
        System.out.println("String Replace string is : " +D);

        System.out.println("Str 2:"+Str2);
        String E = Str2.trim();
        System.out.println("Using trim :" +E);

        String srt3 = "HARS";
        boolean F = str.equals(srt3);
        System.out.println("THe string is equal :" + F);
        System.out.println("Str 2:" +Str2);
        int G = str.indexOf('H');
        System.out.println("THe Index is:"+G);

        int H = str.compareTo(srt3);
        System.out.println("The string compare is:"+H);


        String data =  str + "ART";
        System.out.println("The Original String:"+str);
        System.out.println("The Original String Data :"+data);
        System.out.println("srt , data bot are sme object?:"+(str==data));


    }
}
