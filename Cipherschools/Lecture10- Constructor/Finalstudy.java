import java.lang.*;
import java.util.*;
class A{
    final int noOfAlphabets=26;// final class cannot be inherited.
    final int noOfDigits;
    A(){
        noOfDigits = 20;
    }
    void fun(){
        System.out.println("Hi,I'm default constructor of loan");
    }
}
class B extends A{
    void fun()
    {
        System.out.println("I'm function in B overloding function in A");
    }
}
public class Finalstudy{
    public static void main(String args[]){

    }
}