import java.io.*;
import java.util.*;

public class Main {


    /* public static String goodJob(int num){
        if(num == 100 ){
            String good = "Good job";
            return good;
        }
        String wrong = "Wrong answer";
        return wrong;
    } */


    public static void goodJob(int num){
        if(num == 100 ){
            String good = "Good job";
            System.out.println(good);

        }else {String wrong = "Wrong answer";
            System.out.println(wrong);}

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        int i = inp.nextInt();

        Main.goodJob(i);
    }
}