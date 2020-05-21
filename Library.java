

public class Library {
    public static void main(String[] args) {
        
        Author newAuthor = new Author("Tina", "Fae");
        Book thisBook = new Book("book","fakesubject",125830, newAuthor);
        System.out.print(newAuthor.getAuthor());
       
    }
}