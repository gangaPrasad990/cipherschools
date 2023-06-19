import java.lang.*;
class car{
   String name;
   String colour;
   int year;
   int cost;
   int maxspeed;
   void acceleration(){
      System.out.println("my acceleration");
   }
}
class carstudy{
   public static void main(String args[]){
         car swift=new car();
         swift.name="swift";
         swift.colour="white";
         swift.year=2022;
         swift.cost=1000000;
         swift.maxspeed=120;

         System.out.println(swift.name);
         System.out.println(swift.colour);
         System.out.println(swift.year);
         System.out.println(swift.cost);
         System.out.println(swift.maxspeed);

   }
}
