class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void set(String a,int b){
        name=a;
        rollno=b;
    }
}
public class lec_4{
    public static void main(String[] args) {
        Student st1=new Student("KHuram",78);
        Student st2=st1;
        System.out.println("st1: "+st1.name+"  "+st1.rollno );
        System.out.println("st2: "+st2.name+" "+st2.rollno);
        st2.set("walid",56);
        System.out.println("st1: "+st1.name+"  "+st1.rollno );
        System.out.println("st2: "+st2.name+" "+st2.rollno);
        if(st1==st2){
            System.out.println("Equal");
        }
        
    }
    
}
