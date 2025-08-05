import java.lang.System;                        //System is  a function stored in java's lang package,this import is not required to use System.out.print bcos it is automatically called
import java.util.Scanner;                       //Scanner is a CLASS used to fetch input from user which is stored in java's util package,this import is required to use System.out.print bcos it is not automatically called
class user_input{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);     //Scanner class can be used by calling scanner cls followed by a variable name which is a object
        System.out.print("Enter your name : ");
        String b=a.nextLine();
        System.out.print("Enter a num1 : ");
        int c=a.nextInt();
        System.out.print("Enter a num2 : ");
        int d=a.nextInt();
        a.nextLine();                           // getting string datatype as a input after getting an integer input,scanner object dot nextLine is necessary
        System.out.print("Enter your department : ");
        String e = a.nextLine();
        System.out.print("Enter your cgpa : ");
        double f = a.nextDouble();

        System.out.println("My name is "+b);
        System.out.println("Sum is "+ (c+d));
        System.out.println("My department is "+e);
        System.out.println("My cgpa is "+f+"/10");
    }
}