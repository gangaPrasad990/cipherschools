import java.lang.*;
class student{
    int marks;
    String name;
    boolean checkpass()
    {
        if(marks>=40){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){

        student s1=new student();  //created using student s=new student();
        s1.name="prasad";
        s1.marks=95;
       
        student s2=new student();
        s2.name="ram";
        s2.marks=3;

        System.out.println(s1.checkpass());
        System.out.println(s2.checkpass());

    }
}