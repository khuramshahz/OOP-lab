interface Enumeration{
    public boolean hasNext(int index); 

    public Object getNext(int index); 
}
class NameCollection implements Enumeration{
    String[] names = new String[100]; 
    NameCollection(String[]names){
        this.names=names;
    }
    @Override
    public Object getNext(int index) {
        Object nc=names[index];
        return nc;
    }
    @Override
    public boolean hasNext(int index) {
        return index<names.length;   
    }
}
public class Task_4{
    public static void main(String[] args) {
        String[]name={"usman","ali","yasir","khalid","hunzla","haseeb","ebab","Abdullah"};
        NameCollection NC=new NameCollection(name);
        int size=0;
        while(NC.hasNext(size)){
            Object next=NC.getNext(size);
            if(next!=null){
                System.out.println(next);
            }
            size++;
        }
    }
}
