class Person{
    protected String name;
    protected String email;
    protected String address;
    protected long phone_vo;
    Person(String n,String e,String add,long p){
        name=n;
        email=e;
        address=add;
        phone_vo=p;
    }
    public void display(){
        System.out.print(name+" "+email+" "+address+"  "+phone_vo);
    }
}
class Student extends Person{
    String status;
    Student(String n,String e,String add,long p,String s){
        super(n,e,add,p);
        status=s;
    }
    public void display(){
        super.display();
        System.out.print(status);

    }
}
class Employee extends Person{
    protected String office;
    protected int salaray;
    protected int date_hire;
    Employee(String n,String e,String add,long p,String o,int sal,int h_date){
        super(n,e,add,p);
        office=o;
        salaray=sal;
        date_hire=h_date;
    }
    public void display(){
        super.display();
        System.out.print(office+" "+salaray+" "+date_hire);
    }
}
class Faculty extends Employee{
    protected int office_hour;
    protected String rank;
    Faculty(String n,String e,String add,long p,String o,int sal,int h_date,int h_hour,String r){
        super(n,e,add,p,o,sal,h_date);
        office_hour=h_hour;
        rank=r;
    }
    public void display(){
        super.display();
        System.out.print(office_hour+"  "+rank);
    }
}
class Staff extends Employee{
    protected String title;
    Staff(String n,String e,String add,long p,String o,int sal,int h_date,String t){
        super(n,e,add,p,o,sal,h_date);
        title=t;
    }
    public void display(){
        super.display();
        System.out.print(title);
    }
}
public class Task_1{
    public static void main(String[] args) {
        Student s=new Student("Walid","Walid45@gmail.com","House#90 street 3 jinnnah garden",917567367,"Active");
        Employee e=new Employee("Ali","Ali98@gmail.com","House#23 street 78 gulshan garden",917567367,"IT",90,8);
        Staff stf=new Staff("usman","usman345@gmail.com","House#56 street 33  nazimabad",917567367,"IT",90,8,"campus incharge");
        Faculty f=new Faculty("Qaiz","qaiz777@gmail.com","House#21 street 66 gulshan garden",917567367,"IT",90,8,10,"Senior");
        System.out.println("\nStudent: ");
        s.display();
        System.out.println("\nEmployee: ");
        e.display();
        System.out.println("\nStaff: ");
        stf.display();
        System.out.println("\nFaculty: ");
        f.display();
    }
}
