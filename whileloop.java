import java.util.Random;
class whileloop
{
    public static void main(String args[])
    {
        // initialize;
        // while(condition)
        // {
        //     System.out.println("Hi");
        //     increment or decrement;
        // }

        int i=1;
        while (i<=10)
        {
            System.out.println(i);
            i++;
        }

        Random obj=new Random();    //will generaterandom numbers
        int num=0;
        
        while (num!=6)
        {
            num=obj.nextInt(11);    //11 refers to range 0 to 10
            System.out.println(num);
        }
    }
}