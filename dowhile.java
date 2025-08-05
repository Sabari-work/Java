import java.util.*;
class dowhile{
    public static void main(String args[]){
        int i=0;    //intialize
        do{
            System.out.println("Hi");
            i++;    //increment or decrement
        }while(i<=1);   //condition

        Scanner obj = new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter the input greater than 10");
            a=obj.nextInt();
        }while(a<=10);
        System.out.println(a);
    }
}