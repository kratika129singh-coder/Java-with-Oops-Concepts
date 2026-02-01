import java.util.Scanner;
class Calculator{
    double num1;
    double num2;
    double result;
    int choice;

    void input(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First Number");
        this.num1 =sc.nextDouble();
        System.out.println("Enter the Second Number");
        this.num2=sc.nextDouble();
        System.out.println("==========Choose Any Opration=========");
        System.out.println(" 1: Addition");
        System.out.println(" 2: Subtraction");
        System.out.println(" 3: Multiplication");
        System.out.println(" 4: Division");
        System.out.println(" 5: Modulus");
        System.out.println(" 6: Exit");
        System.out.println("Enter your choice(1 to 6)");
        this.choice=sc.nextInt();
}
    void calculation(){
        switch(choice){
            case 1 : result=num1+num2;
            break;
            case 2 : result=num1-num2;
            break;
            case 3 : result=num1*num2;
            break;
            case 4 : {
                if(num2==0){
                    System.out.println("Sorry! can not divide zero");
                    return;
                }
                result=num1/num2;
                break;
            }
            case 5 : result=num1%num2;
            break;
            case 6 :
                System.out.println("Thank you for coming ");
                return;
            
            default : System.out.println("Please! Enter Valid Choice");
            return;
            }
            }

        void display(){
            System.out.println("=============Result=============");
            switch(choice){
            case 1 : System.out.println("Addition :" + result);
            break;
            case 2 : System.out.println("Subtration :" + result);
            break;
            case 3 : System.out.println("Multiplication :" + result);
            break;
            case 4 : System.out.println("Division : " + result);
            break;
            case 5 : System.out.println("Modulus : " + result);
            break;
            }

        }
    public static void main(String[] args){
        System.out.println("=========Welcome to the Calculator==========");

        Calculator obj=new Calculator();
        obj.input();
        obj.calculation();
        obj.display();
        System.out.println("==============================================");

    }
}