package jasim.com;


import java.util.Arrays;

import static java.lang.Math.*;

public class learn {
    public static void main(String[] arg) {
        //byte
        byte number = 10;
        System.out.println(number);
        //Array
        int[] number1 = {1, 2, 3, 3, 4};
        System.out.println(Arrays.toString(number1));
        //math
        System.out.println(sqrt(199));
        //math maximum
        System.out.println(Math.max(5, 3));
        // math absolute
        System.out.println(Math.abs(-4.7));
        //random number--- 0-100
        int randomNum = (int) (Math.random() * 100);
        System.out.println(randomNum);
        boolean manisboy = true;
        boolean manisgirl = false;
        System.out.println(manisboy);
        System.out.println(manisgirl);
        int time = 1;
        if (time < 20) {
            System.out.println("good day");
        } else {
            System.out.println("good evening");
        }
        int i = 6;
        while (i< 10) {
            System.out.println(i);
          i++;
        }
        System.out.println("         ");
        for ( int a = 0; a<=10; a++)
        { if (a==5)
            System.out.println(a);
        }
    }
}
