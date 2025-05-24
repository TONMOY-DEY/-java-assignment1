package Problem1;

public class Book {
    private String title;
    private String isbn;
    private double price;

    public Book(){
        System.out.println("...................");

    }
    public Book(String title,String isbn,double price){
        this.title=title;
        this.isbn=isbn;
        this.price=price;
    }
    public void settitle(String title){
        this.title=title;
    }
    public String gettitle(){
      return title;
    }
    public void setisbn(String isbn){
        this.isbn=isbn;
    }
    public String getisbn(){
        return isbn;
    }
    public void setprice(double price){
        this.price=price;
    }
    public double getprice(){
        return price;
    }

    public void display(){
        System.out.println("title is:"+title);
        System.out.println("isbn is:"+isbn);
        System.out.println("price is:"+price);
    }
    
}
