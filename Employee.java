class Employee{
    String Name;
    int Salary;
    void display(){
        System.out.println("Employee :-" + Name + " is earning " + Salary );

    }
    public static void main(String[] args){

        Employee obj =new Employee();
        obj.Name="Kratika";
        obj.Salary=700000;
        obj.display();

    }
}