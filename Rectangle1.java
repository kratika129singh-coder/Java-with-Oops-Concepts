public class Rectangle1
{
    int length;
    int breath;
    double area;
    double p;
     void claculateArea(){
        double area = length * breath;
        System.out.println("The Area of Rectangle is " + area + " unit^2");

    }
     void calculateperameter(){
        double p=2*(length+breath); 
        System.out.println("The Parameter of Rectangle is " + p +  " unit");  

    }
    public static void main(String[] args){
        Rectangle1 obj=new Rectangle1();
        Rectangle1 obj2=new Rectangle1();
        obj.length=6;
        obj.breath=5;
        obj.claculateArea();
        obj.calculateperameter();

        System.out.println(" ");
        
        obj.length=9;
        obj.breath=5;
        obj.claculateArea();
        obj.calculateperameter();

    }
}
