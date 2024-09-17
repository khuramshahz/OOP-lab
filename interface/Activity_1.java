interface RegisterForExams{
    public void register();
}
class EmployeeTask implements RegisterForExams{
    private String name;
    private String date;
    private int salary;
    public EmployeeTask(){
        
    }
    public EmployeeTask(String name,String date,int salary){
        this.salary=salary;
        this.name=name;
        this.date=date;
    }
    public void register(){
        System.out.println("Employee is register "+" name :"+name+" salary: "+salary+" date : "+date);
    }
}
class StudentTask implements RegisterForExams{
    private String name;
    private int age;
    private double gpa;
    public StudentTask(){


    }
    public StudentTask(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
    @Override
    public void register() {
        System.out.println("Student is registered "+" Student name: "+name+"  age: "+age+"  GPA: "+gpa);   
    }
}
public class Activity_1{
    public static void main(String[] args) {
        EmployeeTask e=new EmployeeTask("Ahmed","11,02,2001",20000);
        StudentTask s=new StudentTask("Ali",22,3.5);
        e.register();
        s.register();   
    }
}
