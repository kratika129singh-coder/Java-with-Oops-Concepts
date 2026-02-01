class Student {
    String Name;
    int Roll_No;
    int  Marks;

    void Show() {
        System.out.println("===========: Student Details :========== ");
    }

    public static void main(String[] args) {
        //here we have created object,we can create multiple objects in a program
        Student obj = new Student();
        Student  obj2 = new Student();
        //these are value for print/display
        obj.Name = "Kratika";
        obj.Roll_No = 20;
        obj.Marks= 98;
        obj2.Name = "Rishabh";
        obj2.Roll_No = 25;
        obj2.Marks= 70;

        //this is method  
        obj.Show();
        System.out.println("Student Name :" + obj.Name);
        System.out.println("Student Age : " + obj.Roll_No);
        System.out.println("Student Marks : " + obj.Marks);

        
        System.out.println("Student Name :" + obj2.Name);
        System.out.println("Student Age : " + obj2.Roll_No);
        System.out.println("Student Marks : " + obj2.Marks);
    }
}


