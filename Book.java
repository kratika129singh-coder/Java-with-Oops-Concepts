class Book{
    String Title;
    String Author;
    int Price; 
    void show(){
        System.out.println("The Title of the Book : " + Title);
        System.out.println("The Author Name of Book: " + Author);
        System.out.println("The Price of the Book : " + Price);

    }

public static void main(String[] args){
    Book a = new Book();
    Book b = new Book();
    Book c = new Book();

    a.Title="The Power of Now";
    a.Author="Gilbert";
    a.Price=150;
    
    
    b.Title="The Mountain is You";
    b.Author="Brianna Wiest";
    b.Price=300;
    
    c.Title="Rich Dad Poor Dad";
    c.Author="Robert T.Kiyosaki";
    c.Price=250;
    a.show();
    System.out.println("");
    b.show();
    System.out.println("");
    c.show();

}}