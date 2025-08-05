import java.util.Scanner;
import java.lang.System;

class stringifelse{
    public static void main(String args[]){
        String a = "Hello";
        String b = "Hello";
        System.out.println(a.equals(b));
        String c = new String("Hello");
        String d = new String("Hello");
        System.out.println(c==d);           //If two strings are compared with == ,values are not compared instead their address were compared 
        System.out.println(c.equals(d));    //to compare their values .equals is the syntax
        Scanner obj = new Scanner(System.in);
        String e = obj.nextLine();
        String f = obj.nextLine();
        System.out.println(e.equals(f));

    }
}