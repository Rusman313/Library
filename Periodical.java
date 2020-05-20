public class Periodical extends LibraryItem {
    private String publisher;
    private String publishedDate;

    public Periodical(String title, String category, int DDS, String publisher, String publishedDate) {
        super(title, category, DDS);
        this.publishedDate = publishedDate;
        this.publisher = publisher;
    }

    //Setters and Getters

    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublishedDate(){
        return publishedDate;
    }
    public void setPublishedDate(String publishedDate){
        this.publishedDate = publishedDate;
    }
    
}