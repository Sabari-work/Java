import java.util.Scanner;
class logicaloperator{
    public static void main(String args[]){
        boolean cricket = true;
        boolean football = true;
        if(cricket && football){
            System.out.println("Play both");
        }
        else{
            System.out.println("False");
        }
        Scanner obj = new Scanner(System.in);
        String a = obj.nextLine();
        String b = obj.nextLine();
        if(a.equals("football") && b.equals("cricket")) //&& ||
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}