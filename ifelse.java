import java.lang.System;
import java.util.Scanner;
class ifelse{
    public static void main(String args[]){
        System.out.println(7>4);
        System.out.println(7>8);
        System.out.println(7==4);
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        if(a==b){
            System.out.print("Numbers are equal");
        }
        else
        System.out.print("Numbers are not equal");
        
    }
}