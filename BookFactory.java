/*import java.util.ArrayList;
import java.util.List;*/
/*DONT PAY ATTENTION TO THIS CODE IT IS USELESS AND A WORK IN PROGRESS*/
public class BookFactory {
    
       
      /*  Author Tina = new Author("Tina", "Fae");
        
        Author newAuthor = new Author("psudo", "name");
        GeneralBook thisBook = new GeneralBook("book","fakesubject",125830, Tina);
        ReferenceBook refBook = new ReferenceBook("I am a Reference Book", "Science", 300, Karish);
        GeneralBook genBook = new GeneralBook("title", "category", 300, newAuthor);
        List<GeneralBook> gb = new ArrayList<>();
        gb.add(thisBook);
        gb.add(genBook);
        List<ReferenceBook> rb = new ArrayList<>();
        rb.add(refBook);
      
         

    }

	public static void createBook(String title, String subject, int dDS, String string) {
    }
    public static void createGeneralBook(String title, String category, int DDS, Author authorName) {
    
}*/

//Book type = null;


    public static Book createBook(BookType type) {
        Book d = null;
        Author Karish = new Author("Kapoor","Kareena");
        Author Tina = new Author("Tina", "Fae");
       

        if (type == null) {
            return null;
        }
        switch (type) {
            case GENERAL:
                d = new GeneralBook("book","fakesubject",125830, Tina);
                break;
            case REFERENCE:
                d = new ReferenceBook("I am a Reference Book", "Science", 300, Karish);
                break;
            
            default:
        }

        return d;
    }
}

