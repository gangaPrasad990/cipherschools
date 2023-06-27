import java.lang.*;
import java.util.*;

class loan{
    int rate;
    loan(){
        System.out.println("Hi,I'm default constructor of loan");
    }
    loan(int rate){
        this.rate =rate;
    }
    void printRate(){
        System.out.println(this.rate);
    }
}
class carloan extends loan{
    int rate;
    carloan(){
        System.out.println("Hi,I'm default constructor of loan");
        System.out.println(super.rate);
    }
    carloan(int rate){
        super(7);
        this.rate =rate;
    }
    void printrate(){
        System.out.println(this.rate);
        super.printRate();
        System.out.println(super.rate);
    }
}
public class superstudy{
    public static void main(String args[]){
        carloan cl2 =new carloan();
        carloan cl =new carloan(8);
        cl.printRate();
    }
}

