import java.util.Scanner;
public class Salary{
   int emp1(int basic){
    return basic;
         }
    int emp2(int basic,int bonus){
        return basic + bonus;

    }
    int emp3(int basic,int bonus,int overtime){
        return basic+bonus+overtime;
    }
}
class main{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Basic Salary");
        int basic = Sc.nextInt();
          System.out.println("Enter the Bonus Salary");
        int  bonus= Sc.nextInt ();
          System.out.println("Enter the Overtime  Salary");
        int  overtime = Sc.nextInt();

        Salary obj=new Salary();
        System.out.println("Basic Salary :- " + obj.emp1 ( basic) );
        System.out.println("Bonus Found :- " + obj.emp2(basic,bonus) );
        System.out.println("Overtime Salary :- " + obj.emp3(basic,bonus,overtime) );
        
    
    
    
    }
}
