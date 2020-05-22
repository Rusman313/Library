import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        
        Author newAuthor = new Author("Tina", "Fae");
        Book thisBook = new Book("book","fakesubject",125830, newAuthor);
        System.out.print(newAuthor.getAuthor());
        System.out.println(thisBook);

        GeneralBook genBook = new GeneralBook("title", "category", 300, newAuthor);
        List<GeneralBook> gb = new ArrayList<>();
        gb.add(genBook);
     Book thiis = BookFactory.createBook(BookType.GENERAL);
       System.out.println(thiis);
      /*BookFactory.createBook("title", "subject", 321, "Tomy Jerry");
       BookFactory.createGeneralBook(title, category, DDS, authorName);*/

       
    }
}