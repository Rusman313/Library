 
public class Magazine extends Periodical {
    String publisher;
    String publishedDate;
    public Magazine(String title, String category, int DDS, String publisher, String publishedDate) {
        super(title, category, DDS);
        this.publishedDate = publishedDate;
        this.publisher = publisher;
       
    }
    
}