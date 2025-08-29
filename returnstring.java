public class returnstring {
    String name (String a) // function should not be void if it returns
    {
        return a;
    }
    public static void main(String[] args) {
        returnstring obj = new returnstring();
        System.out.println(obj.name("hello"));
    }
}