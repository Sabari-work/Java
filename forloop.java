/*get input for starting and ending numbers and print the number of times the od  number occurs*/
import java.util.*;
class forloop{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int count =0;
        for(int i=a;i<=b;i++){
            if(i%2!=0)
            {
                count ++;
            }
        }
        System.out.print(count);
    } 
}