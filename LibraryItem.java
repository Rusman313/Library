public class LibraryItem{
    private String title, category;
    private int DDS;

    public LibraryItem(String title, String category, int DDS){    
        this.title = title;        
        this.category = category;
        this.DDS = DDS;
    }

    //Getters and Setters

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public int getDDS() {
        return DDS;
    }
    public void setDDS(int DDS){
        this.DDS = DDS;
    }

}