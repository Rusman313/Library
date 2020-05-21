public class Periodical extends LibraryItem implements Reservable{
    private PublishingCompany publisher;
    private String publishedDate;

    public Periodical(String title, String category, int DDS, PublishingCompany publisher, String publishedDate) {
        super(title, category, DDS);
        this.publishedDate = publishedDate;
        this.publisher = publisher;
    }

    //Setters and Getters

    public PublishingCompany getPublisher(){
        return publisher;
    }
    public void setPublisher(PublishingCompany publisher){
        this.publisher = publisher;
    }
    public String getPublishedDate(){
        return publishedDate;
    }
    public void setPublishedDate(String publishedDate){
        this.publishedDate = publishedDate;
    }

    //Implements methods from IReservable
    @Override
    public boolean isReservable(){
        return true;
    }
    
}