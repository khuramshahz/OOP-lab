class Marks{
    int physics;
    int chemistry;
    int DSP;
    Marks(){
        physics=56;
        chemistry=90;
        DSP=86;
    }
    Marks(int physics,int chemistry,int DSP){
        this.DSP=DSP;
        this.chemistry=chemistry;
        this.physics=physics;
    } 
    public int Sum(){
        int total=physics+chemistry+DSP;
        return total;

    } 
}
public class labtask_4{
    public static void main(String[] args){
        Marks stu=new Marks();
        int total=stu.Sum();
        System.out.println("The total marks is : "+total);
        stu=new Marks(67,89,66);  
        total=stu.Sum();
        System.out.println("The total marks are : "+total);    
    }
    
}
