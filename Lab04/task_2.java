class Book{
    private String author;
    private String chapterNames[]=new String[100]; 
    public Book(){
        String chap[]={"The One Thing Needful","Murdering the Innocents","A Loophol"};
        chapterNames=chap;
        author="Ghalib";
    }
    public Book(String name,String chapter[]){
        chapterNames=chapter;
        author=name;
    }
    public boolean Comparebooks(Book pb){
        boolean tem=author.equals(pb.author);
        return tem;
    }
    public Book comparechapter(Book pa){
        int size1=this.chapterNames.length;
        int size2=pa.chapterNames.length;
        if(size1>size2){
            return this;
        }
        else{
            return pa;
        }   
    }
    public String getauthor(){
        return author;
    }
}
public class task_2{
    public static void main(String[] args){
        Book b1=new Book();
        String []chapter={"Stopping by mmon","Beyond the skies"};
        Book b2=new Book("Iqbal",chapter);  
        System.out.println("Does both author have same author: "+b1.Comparebooks(b2)); 
        Book tem=new Book();
        tem=b1.comparechapter(b2);
        System.out.println("Whose author book has greater chapter: "+tem.getauthor());
    }
}
