public class methodoverload {
    int sum(int a,int b)  // function is aka method
    {
        return a+b;
    }

    int sum(int a,int b,int c)  // function name can be same but arguments should vary. if both arguments and function name are same , then it creates error
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        methodoverload obj = new methodoverload();
        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum(1,2,3));
    }
}
