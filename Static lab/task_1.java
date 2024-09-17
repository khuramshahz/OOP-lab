class Count{
    static int obj_num;
    Count(){
        obj_num++;
    }
}
public class task_1{
    public static void main(String[] args) {
        Count ob1=new Count();
        Count ob3=new Count();
        Count ob2=new Count();
        Count ob4=new Count();
        System.out.println("The number of object created in the program is : "+Count.obj_num);   
    }  
}
