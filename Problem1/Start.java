package Problem1;

public class Start {
    public static void main(String[] args) {
        Author3 A1=new Author3("TONMOY", "TONMOY DEY1207 @gmail.com", "British author, best known for the Harry Potter series", 2);
        Ebook b1=new Ebook("Harry Potter and the Chamber of Secrets", "987654321", 450.0, "15MB", "www.hp.com/ebook2");
        Ebook b2=new Ebook("Harry Potter and the Prisoner of Azkaban", "1122334455", 400, "18MB","https://www.pottermore.com/ebooks/prisoner-of-azkaban");
        System.out.println("After add the Book:");
        System.out.println("...........................");
        A1.addBook(b1);
        A1.addBook(b2);
        A1.display();
        System.out.println("After removing book:");
        System.out.println("........................");
        A1.removeBook(b2);
        A1.display();


    }
    
}
