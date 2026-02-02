import java.util.Scanner;
class Circle{
    double radious;
    double area;
    double parameter;
    
    void input(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Radious of circle");
        double radious=Sc.nextDouble();
        area = 3.14 * radious * radious;
        parameter =2 * 3.14 * radious;
    } 
    void output(){
        System.out.println("The Area of the Circle is " + area);
        System.out.println("The Parameter of the Circle is " + parameter);
    }
    
    public static void main(String[] args){

        Circle obj =new Circle();
        System.out.println("=============Circle===========");
        
        obj.input();
        obj.output();
        System.out.println("===============================");



    }

}