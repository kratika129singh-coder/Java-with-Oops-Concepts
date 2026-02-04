import java.util.Scanner;
class StudentResult
{//class
     String name;
   static String college= "Gagan College Mangament & Technology";//static keyword
     int[] marks =new int[5];
    String result;
    double percentage;

      StudentResult(String name,int[] marks)//constructor
        {
        this.name=name;  //this keyword
        this.marks=marks;
        }
   void calculate()

    {//method
       int sum=0;
     for(int m:marks){
        sum=sum+m;
        }
  this.percentage = sum/5.0;
     if(this.percentage>=40){
       this. result="Passed";}
        else{
       this. result="Failed";
        }
    }
   void output()
   {
        System.out.println("=============================Final Result===============================");
        System.out.println("Student  Name :-" + name );
        System.out.println("College Name :- " + college);
        System.out.println("Marks :-");
        for(int num : marks){
            System.out.print(num + " ");
        }
        System.out.println("Percentage :- " + percentage + " %" );
        System.out.println("Result :" + result);
        System.out.println("======================================================================");
        
    }
  }

 class main{

    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("===============Welcome to  in our Result Management System================");
        System.out.print("Enter the Student Name :-");
        String name=Sc.next();
        int[] marks=new int[5];
        System.out.println("Enter the Marks of each Subject :-");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Subject " + (i+1) +": " );
            marks[i]=Sc.nextInt(); 
        }

        StudentResult obj=new StudentResult(name, marks);

        obj.calculate();
        obj.output();  

    
 }
 }