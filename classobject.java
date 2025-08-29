import java.util.*;
class classobject{
    String name,dept;
    int age,mobile=0;
    
    public static void main(String args[]){
        classobject stud1= new classobject();
        stud1.name="aaa";
        stud1.age=12;
        System.out.println(stud1.age);
        classobject stud2= new classobject();
        System.out.println(stud2.age);
    }
}