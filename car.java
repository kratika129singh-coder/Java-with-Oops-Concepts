package GADI;
class car {//this is clase 
      int speed;
      String color;
      String brand;

      car(){//default
         speed=80;
         color="black";
         brand="BMW";

      }
      car(int s,String c,String b){//paramertrized
         speed=s;
          color=c;
          brand=b;


      }
      car(car MyCar){//copy
         speed=MyCar.speed;
         color=MyCar.color;
         brand=MyCar.brand;

      }

      void Drive(){  //these are methods
         System.out.println("The  " + brand + " 's  color is " + color + ".  and The Spped of the Car is " + speed + " Km/h."  );

      }
      void brake(){
         System.out.println("Yes! There is  Smart brake ");

      }}
      
   class Main{
   public static void main(String[] args){
       car MyCar = new car(); //mycar is a objects here
       car MyCar2 = new car(60,"Blue","Thar");
       car MyCar3 = new car(MyCar); 

       //these are attributes here
      // MyCar.color="Black";
      // MyCar.speed=70; 
       //M/yCar.brand="BMW";

       //MyCar2.color="Blue";
      // MyCar2.speed=60; 
       //MyCar2.brand="Thar";
       
       //these are calling method
       MyCar.Drive();
       MyCar.brake();
       System.out.println("");
       
       MyCar2.Drive();
       System.out.println("There is no facility of smart brake Sorry!");
       System.out.println("");
       
       MyCar3.Drive();
       MyCar3.brake();
   

   }
}
