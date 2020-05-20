public class Book extends LibraryItem {
    private String author;
    public Book (String title, String subject, int DDS, String author){
        super(title, subject, DDS);
        this.author = author;
    }

    //Setter and Getter
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}