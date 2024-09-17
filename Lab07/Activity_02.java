class commissionEmployee{
    protected String Firstname;
    protected String Lastname;
    protected String SSN;
    protected double grossSales;
    protected double commonRate;
    public commissionEmployee(){
        Firstname="Nagina";
        Lastname="Nazar";
        SSN="S003";
        grossSales=1234.1;
        commonRate=12.5;
    }
    public commissionEmployee(String a,String b,String c,double d,double e){
        Firstname=a;
        Lastname=b;
        SSN=c;
        grossSales=d;
        commonRate=e;
    }
    public void setFN(String a){
        Firstname=a;
    }
    public void setLN(String b){
        Lastname=b;
    }
    public void setSSN(String c){
        SSN=c;
    }
    public void setGS(double c ){
        grossSales=c;
    }
    public void setCR(double d){
        commonRate=d;
    }
    public String getFN(){
        return Firstname;
    }
    public String getLN(){
        return Lastname;
    }
    public String getSSN(){
        return SSN;
    }
    public double getGS(){
        return grossSales;
    }
    public double getCR(){
        return commonRate;
    }
    public double earning(){
        return  grossSales*commonRate;
    }
    public void display(){
        System.out.println("First name: "+Firstname+"\nLast name: "+Lastname+"\nSSN: "+SSN+"\nGross sales: "+grossSales+"\nCommon rate: "+commonRate);
    }
}
class BasePlusEmployee extends commissionEmployee{
    private double salary;
    BasePlusEmployee(){
        salary=48000;
    }
    BasePlusEmployee(String A,String B,String C,double D,double E,double F){
        super(A,B,C,D,E);
        salary=F;
    }
    public double earning(){
        return super.earning()+salary;
    }
    public void display(){
        super.display();
        System.out.println("Salary: "+salary);
    }
}
public class Activity_02{
    public static void main(String[] args) {
        BasePlusEmployee b=new BasePlusEmployee("Ali","Ahmad","25-kkn",100,5.2,25000);
        double earn=b.earning();
        System.out.println("Earning of employee is: "+earn);   
    }
}
