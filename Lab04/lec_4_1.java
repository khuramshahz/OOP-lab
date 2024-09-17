class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public Student(Student tem){
        this.name=tem.name;
        this.rollno=tem.rollno;
    }
}
public class lec_4_1{
    public static void main(String[] args) {
        Student st1=new Student("Walid",123);
        Student st2=new Student(st1);
        System.out.println("st1: "+st1.name+" "+st1.rollno);
        System.out.println("st2: "+st2.name+" "+st2.rollno);  
    }
}
