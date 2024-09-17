class Computer{
    protected int wordsize;
    protected int memorysize;
    protected int storagesize;
    Computer(int w,int m,int s){
        wordsize=w;
        memorysize=m;
        storagesize=s;
    }
    public void display(){
        System.out.print("\nWordsize: "+wordsize+"\nmemorysize: "+memorysize+"\nstoragesize: "+storagesize);
    }
}
class Laptop extends Computer{
    protected double objects_length;
    protected double width;
    protected double height;
    protected double weight;
    Laptop(int w,int m,int s,double o_length,double wid,double hit,double wei){
        super(w,m,s);
        objects_length=o_length;
        width=wid;
        height=hit;
        weight=wei;
    }
    public void display(){
        super.display();
        System.out.print("\nwidth: "+width+"\nHeight: "+height+"\nweight: "+weight+"\nObject length: "+objects_length);
    }
}
public class Task_3{
    public static void main(String[] args) {
        Laptop l1=new Laptop(90,23,12,45,56,67,100);
        System.out.println("Laptop: ");
        l1.display();        
    }
}
