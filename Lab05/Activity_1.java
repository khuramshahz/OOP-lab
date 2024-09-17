class StudentRecord{
    private String degree;
    public StudentRecord(){

    }
    public void setDegree(String d){
        degree=d;
    }
    public String getDegree(){
        return degree;
    }
}
class employeeRecord{
    private int emp_id;
    private double salary;
    public employeeRecord(){

    }
    public void setEmp_id(int id){
        emp_id=id;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public void setsalary(double s){
        salary=s;
    }
    public double getSalary(){
        return salary;
    }
}
class Manager{
    private String title;
    private double dues;
    private employeeRecord em; 
    private StudentRecord stu;
    public Manager(String t,double d,employeeRecord e,StudentRecord s){
        title=t;
        dues=d;
        em=e;
        stu=s;
    }
    public void display(){
        System.out.println("Title is "+title);
        System.out.println("Dues are "+dues);
        System.out.println("Emplpoyee record is as under:  ");
        System.out.println("Employee id is: "+em.getEmp_id());
        System.out.println("Employee salary is : "+em.getSalary());
        System.out.println("Student record is as under: ");
        System.out.println("Degree is : "+stu.getDegree());
    }
}
public class Activity_1{
    public static void main(String[] args) {
        StudentRecord s=new StudentRecord();
        s.setDegree("MBA");
        employeeRecord e=new employeeRecord();
        e.setEmp_id(1);
        e.setsalary(25000);
        Manager m1=new Manager("financial manager",5000,e,s);
        m1.display();
    }
}
