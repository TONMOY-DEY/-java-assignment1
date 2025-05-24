package Problem1;

public class Ebook extends Book {
    private String filesize;
    private String downloadurl;

    public Ebook(){
        System.out.println(".........................");
    }
    public Ebook(String title,String isbn,double price,String filesize,String downloadurl ){
        super(title,isbn,price);
        this.filesize=filesize;
        this.downloadurl=downloadurl;
    }
    public void setfilesize(String filesize){
        this.filesize=filesize;
    }
    public String  getfilesize(){
        return filesize;
    }
    public void setdownloadurl(String  downloadurl){
        this.downloadurl=downloadurl;
    }
    public String getdownloadurl(){
        return downloadurl;
    }
    public void display(){
        super.display();
        System.out.println("file size is:"+filesize);
        System.out.println("downloadurl is:"+downloadurl);
        
    }
        
    }

    
