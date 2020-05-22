import java.util.ArrayList;
import java.util.List;

public class CardHolder {
    private String firstName;
    private String lastName;
    private int libraryCardNum;
    List <String> overdueBooks = new ArrayList<String>();//TODO come back to this!
   public CardHolder(){

   } 

   //Getters and Setters
   public String getFirstName(){
       return firstName;
   }
   public void setFirstName(String firstName){
       this.firstName = firstName;
   }
   public String getLastName(){
    return lastName;
}
public void setLastName(String lastName){
    this.lastName = lastName;
}

public int getLibraryCardNum() {
    return libraryCardNum;
}
public void setLibraryCardNum(int libraryCardNum){
    this.libraryCardNum = libraryCardNum;
}


}