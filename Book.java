public class Book extends LibraryItem implements Reservable, Loanable {
    //private String author;
    public Author authorName;
    public LateCharges lateCharges;

    public Book (String title, String subject, int DDS, Author authorName){
        super(title, subject, DDS);
        //this.author = author;
        this.authorName = authorName;
    }
    
    //Setter and Getter
    public Author getAuthor() {
        return authorName;
    }
    public void setAuthor(Author authorName){
       this.authorName = authorName;
    
    }
    
    // Implementing methods from IReservable
    @Override
    public boolean isReservable(){
        return true;
    }

    //Implementing methods from ILonable
   @Override
    public boolean isLonable() {        
        return true;
    }
    @Override
public  void lateFee(int days) {
    int yourBill = fee * days;
    System.out.println(yourBill);

}

int fee = 0;   
public void setLateFee(){
    
    switch (this.lateCharges) {
        case DAILY:
            fee = 1;            
            break;
        case WEEKLY:
            fee = 5;
            break;
        case BIWEEKLY:
            fee = 7;
            break;
        case MONTHLY:
            fee = 15;
            break;    
        default:
        fee = 0;
            break;
    }
    System.out.println("Your late fees are: " + fee);

}

//public static void printBookInfo() {
    //System.out.println(title +  );
    
//}

  /* class Author{
        String firstName;
        String lastName;
        String author = lastName + firstName;
        public Author(){//default no parameters are passed
            this.firstName = "Jane";
            this.lastName = "Doe";
            

        }
        public Author(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            
        }

        //Getters and Setters
        public String getAuthor(){
            this.author =  this.lastName+", " +this.firstName;
            return author;
        }
        public void setFirstName(String firstName){this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
   
   
    }*/
}