import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


class room{
    float len,br;
    void getdata(float a,float b){
        len=a;
        br=b;
    }
}
public class sample {
    public static void main(String args[]){
        float area;


        room r1 = new room();
        r1.getdata(11.11f,22.22f);
        area = r1.len * r1.br;
        System.out.println("Area = " + area);

        String s1 = " His is hava class";
        char s2 = 'w';
//        Date date = new Date();
        Date dates = new Date(2012,3,02);
        System.out.println("date is "+ dates.getDay());
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is "+ currentDate);

        int number = 1;

        boolean flag = true;
        boolean flagg = false;
        //Single line comment
        /*** We are commenting
         * multi line
         */

    }
}
