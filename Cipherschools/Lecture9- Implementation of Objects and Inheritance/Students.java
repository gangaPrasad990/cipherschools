import java.lang.*;
import java.util.*;
class Students{
    int rollNo;
    String name;
    public static void main(String args[]){
    Students s1=new Students();
     s1.name="nani";
     s1.rollNo=1;

     System.out.println(s1.name);
     System.out.println(s1.rollNo);


     Students s2=new Students();
     s2.name="ram";
     s2.rollNo=2;

     System.out.println(s2.name);
     System.out.println(s2.rollNo);
    }
}