class Animals{
    void eat(){
        System.out.println("Animals are eating");
    }
}
class Dog extends Animals{
    //void barks(){
      //  System.out.println("and the Dogs are barking");
    void eat1(){
        System.out.println("dogs are also eating");
    }
    }
class cat extends Dog{
    void mewow(){
        System.out.println("and Cat is mewowing+");
    }
}


 class main
{
 public static void main(String[] args){
        cat obj=new cat();
        Dog obj1=new Dog();
        obj.eat1();
        obj1.eat();
       // obj.barks();
        obj.mewow();
    // obj1.eat();
     //obj.mewow();
    
    }
}