/*get input for salary and age.if salary greater than or equal to 20000 or age less than or equal to 25
get input for required loan amount. if not print you are not eligible for loan. if required loan amount
is less than or equal to 50000 print you are eligible to loan. if greater than 50000 print maximum loan amount s 50000*/

import java.util.*;
class nestedif{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = obj.nextInt();
        System.out.println("Enter your salary : ");
        int sal = obj.nextInt();
        if(sal>=20000 || age <= 25)
        {
            System.out.println("Enter the required loan amount : ");
            int amt = obj.nextInt();
            if(amt <= 50000)
            {
                System.out.println("You are eligible to loan");
            }
            else
            {
                System.out.println("Max loan amount is 50000");
            }
        }
        else
        {
            System.out.println("You are not eligible");
        }
    }
}