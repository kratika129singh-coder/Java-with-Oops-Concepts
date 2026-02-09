public class Printer{
    //polymorphism learning
    //method overloading check
    void print(int n){//same method name
        System.out.println("Number :- " + n);

    }
   void  print(String s){//same name but different parameter 
        System.out.println("String :- " + s);


    }
    void print(int a ,int b){
        int c = a + b;
        System.out.println("Sum of the Number :- " + c );
    }
}
    class main{
    public static void main(String[] args){
        Printer p = new Printer();
       p.print(5);
       p.print("Kratika");
       p.print(3,6);
 }
}