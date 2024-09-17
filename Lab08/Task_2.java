class Publication{
    protected String title;
    protected int price;
    Publication(String t,int p){
        price=p;
        title=t;
    }
    public void setTitle(String t){
        title=t;
    }
    public void setPrice(int p){
        price=p;
    }
    public String getTitle(){
        return title;
    }
    public int getprice(){
        return price;
    }
    public void display(){
        System.out.print("\nTitle: "+title+"\nPrice: "+price);   
    }
}
class Book extends Publication{
    protected int page_count;
    Book(String t,int p,int p_c){
        super(t, p);
        page_count=p_c;
    }
    public int getprice(){
        return price;
    }
    public int getPageCOunt(){
        return page_count;
    }
    public void display(){
        super.display();
        System.out.print("\nPage count: "+page_count);
    }
} 
class Tape extends Publication{
    protected int palying_time;
    Tape(String t,int p,int pl_time){
        super(t, p);
        palying_time=pl_time;
    }
    public void setPlayingTime(int pl_time){
        palying_time=pl_time;
    }
    public int getPlayingtime(){
        return palying_time;
    }
    public void display(){
        super.display();
        System.out.print("\nPlaying time: "+palying_time);
    }
}
public class Task_2{
    public static void main(String[] args) {
        Book b=new Book("Kite runner",2300,560);
        Tape t=new Tape("The dark",7800,90);
        System.out.println("\nBook: ");
        b.display();
        System.out.println("\nTape: ");
        t.display();
        System.out.println();
        b.setPrice(9000);
        b.display();
    }
}
