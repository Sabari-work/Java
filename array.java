import java.util.*;
class array{
    public static void main(String args[]){
        int[] a1 = {1,2,3,4,5};
        System.out.println(a1[1]);

        String[] a2 = {"aaa","bbb","ccc"};
        System.out.println(a2[0]);

        String[] a3 = new String[3];
        a3[2]="ccc";
        System.out.println(a3[2]);

        Scanner obj = new Scanner(System.in);
        int val = obj.nextInt();
        int[] a4 = new int[val];
        int sum=0;
        for(int i=0;i<val;i++)
        {
            a4[i]=obj.nextInt();
            sum = sum + a4[i];
        }
        System.out.println(sum);            //sum of elements ina an array
        System.out.println(a4[(val/2)]);    //middle element in an array
    }
}