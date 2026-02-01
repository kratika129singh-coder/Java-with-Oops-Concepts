package GADI;
class car {
      int speed;
      String color;
      String brand;

      void Drive(){
         System.out.println("The  " + brand + " 's  color is " + color + ".  and The Spped of the Car is " + speed + " Km/h."  );

      }
      void brake(){
         System.out.println("Yes! There is  Smart brake ");

      }}
      
   class Main{
   public static void main(String[] args){
       car MyCar = new car(); //mycar is a objects here
       car MyCar2 = new car(); 

       //these are attributes here
       MyCar.color="Black";
       MyCar.speed=70; 
       MyCar.brand="BMW";

       MyCar2.color="Blue";
       MyCar2.speed=60; 
       MyCar2.brand="Thar";
       
       //these are calling method
       MyCar.Drive();
       MyCar.brake();
       
       MyCar2.Drive();
       System.out.println("There is facility of smart brake Sorry!");
   

   }
}
