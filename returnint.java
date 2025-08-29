public class returnint {
    int sum (int a,int b) // function should not be void if it returns
    {
        return a+b;
    }
    public static void main(String[] args) {
        returnint obj = new returnint();
        System.out.println(obj.sum(10,20));
    }
}
