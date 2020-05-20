public class Book extends LibraryItem {
    String author;
    public Book (String title, String subject, int DDS, String author){
        super(title, subject, DDS);
        this.author = author;
    }
}