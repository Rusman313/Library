public class OverdueList<E extends Book> {

    private E overdueItem;

    public OverdueList(E overdueItem){
        this.overdueItem = overdueItem;
    }

    //Getter
    public E getOverdueItems(){
        return this.overdueItem;
    }
// TODO possibly make a setter for overdue items. 

    
}