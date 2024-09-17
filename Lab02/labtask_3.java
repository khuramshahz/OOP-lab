class Distance{
    int feet;
    int inches;
    Distance(){
        feet=9;
        inches=8;
    }
    Distance(int feet,int inches){
        this.feet=feet;
        this.inches=inches;
    }
    void Display(){
        System.out.println("The inches is : "+inches+"\nand the feet are : "+feet);   
    }
}
public class labtask_3{
    public static void main(String[] args) {
        Distance d1=new Distance();
        d1.Display();
        d1=new Distance(78,90);
        d1.Display();   
    }
}
