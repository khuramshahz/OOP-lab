public abstract class Employee{
    private String firstname;
    private String lastname;
    private String socialsecuritynumber;
    Employee(String first,String last,String scn){
         firstname=first;
         lastname=last;
         socialsecuritynumber=scn;
    }
    public String toString(){
        return String.format("%s%s\nsocial security number : %s",firstname,lastname,socialsecuritynumber);
    }
    public abstract double earning();


}
public class salariedEmployee extends Employee{
    private double weeeklysalary;
    salariedEmployee(String first,String last,String scn,double salary){
        super(first, last, scn);
        weeeklysalary=salary;
    }
    public double earning(){
        return weeeklysalary;
    }
}
public class HourlyEmployee extends Employee{
    private double hour;
    private double wage;
    HourlyEmployee(String first, String last, String scn,double h,double w) {
        super(first, last, scn);
        wage=w;
        hour=h;
    }
    
    
    public double earning(){
        if(hour<=40){
            return hour*wage;
        }
        else{
            return 40*wage+(hour-40)*wage*1.5;
        }
    }
}
public class CommissionEmployee extends Employee{
    private double grosssales;
    private double commissionrate;
    CommissionEmployee(String first,String last,String scn,double gr,double cr){
        super(first, last, scn);
        grosssales=gr;
        commissionrate=cr;
    }
    @Override
    public double earning() {
        
        return commissionrate*grosssales;
    }

}
public class Base
public class Activity_01{
    public static void main(String[] args) {
        
    }
    
}
