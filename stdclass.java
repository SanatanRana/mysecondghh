import java.util.*;
public class stdclass{
    public static class Student {
        String name;
        String college;
        int roll;
        char clas;
        Double per ;
        
    }
    public static void main(String[] args) {
         Student s1 = new Student();
         s1.clas= 'e';
         s1.college="oist";
         s1.name="sanatan rana";
         s1.roll=231;
         System.out.println(s1.clas);
         System.out.println(s1.name);
         System.out.println(s1.per);
         System.out.println(s1.roll);
         Student s2 = new Student();
         s2.name="piyush";
         System.out.println(s2.name);
    }
}