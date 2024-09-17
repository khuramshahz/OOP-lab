class Marks{
    private int physics;
    private int chemistry;
    private int oop;
    Marks(){
        physics=-23;
        chemistry=56;
        oop=45;
        if(physics<0||chemistry<0||oop<0){
            if(physics<0){
                physics=0;
                System.out.println("the marks for physics in not valid");
            }
            if(chemistry<0){
                System.out.println("The marks for chemistry is not valid");
                chemistry=1;
            }
            if(oop<0){
                System.out.println("The marks for oop is nt valid");
                oop=1;
            }
        }
    }
    Marks(int a,int b,int c){
        if(a<0){
            System.out.println("not valid physics marks ");
            a=0;
        }
        if(b<0){
            System.out.println("not valid chemistry marks");
            b=0;
        }
        if(c<0){
            System.out.println("not valid oop marks");
            c=0;
        }
        physics=a;
        chemistry=b;
        oop=c;
        
    }
    public void set(int x,int y,int z){
         if(x<0){
            System.out.println("not valid physics marks ");
            x=0;
        }
        if(y<0){
            System.out.println("not valid chemistry marks");
            y=0;
        }
        if(z<0){
            System.out.println("not valid oop marks");
            z=0;
        }
        physics=x;
        chemistry=y;
        oop=z;
        
    }
    public int[] get(){
        int arr[]={physics,chemistry,oop};
        return arr;
    }
    public void display(){
        System.out.println("Marks of physics is :"+physics+"\nMarks of chemistry is : "+chemistry+"\nMarks of oop is : "+oop);
    }
}
public class task_1{
    public static void main(String[] args) {
        Marks stu_1=new Marks();
        Marks stu_2=new Marks(45,56,90);
        stu_1.set(45,67,89);
        stu_2.set(90,78,56);
        int arr_1[]=stu_1.get();
        int arr_2[]=stu_2.get();
        System.out.println("Marks of student 1 is : ");
        stu_1.display();
        System.out.println("Marks of student 2 is : ");
        stu_2.display();   
    }
}
