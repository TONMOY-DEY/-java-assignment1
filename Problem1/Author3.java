package Problem1;

//

public class Author3 {
    private String name;
    private String email;
    private String biography;
    private Book bo[];

    public Author3(String name,String email,String biography,int size){
        this.name=name;
        this.email=email;
        this.biography=biography;
        this.bo=new Book[size];
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setemail(String email){
        this.email=email;
    }
    public String getemail(){
        return email;
    }
    public void setbiography(String biography){
        this.biography=biography;
    }
    public String getbiography(){
        return biography;
    }

    public void addBook(Book bok){
        for(int i=0;i<this.bo.length;i++){
            if(bo[i]==null){
                bo[i]=bok;
                break;
            }
        }
    }
    public void removeBook(Book bok){
        for(int i=0;i<this.bo.length;i++){
            if(bo[i]==bok){
                bo[i]=null;
                break;
            }
        }
    }
    public void display(){
        for(Book b1:bo){
            if(b1!=null){
                b1.display();
                System.out.println("...............................");
            }
        }
    }


    
}
