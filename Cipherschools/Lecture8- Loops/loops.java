import java.lang.*;
class loops{
    public static void main(String args[]){
        // for loops
        int i;
        for(i=0;i<=100;i++)
        {
           System.out.println(i);
        }

        //while loops

        int n=3;
        while(n>2){
            System.out.println(true);
            n--;
        }
        System.out.println("after while loop n is " +n);
         
        //do-while loop

        n=5;
        do{
            System.out.println(n);
            n--;
        }while(n>0);



    }
}