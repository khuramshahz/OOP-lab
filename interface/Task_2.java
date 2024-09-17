import java.util.regex.PatternSyntaxException;

interface Payable{
    double getPaymenyAmount();
    String toString();
}
class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    Invoice(){

    }
    Invoice(String partNumber,String partDescribtion,int quantity,double pricePerItem){
        this.partNumber=partNumber;
        this.partDescription=partDescribtion;
        this.quantity=quantity;
        this.pricePerItem=pricePerItem;
    }
    @Override
    public double getPaymenyAmount() {
        return pricePerItem*quantity;
        
    }
    public String toString(){
        return ("Invoice : "+"\nPartnumber: "+partNumber+"\nPart Describtion: "+partDescription+"\nQuatitiy: "+quantity+"\nPrice per item: "+pricePerItem);
    }
}
class Employees implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private int Salary;
    Employees(String firstName,String lastName,String socialSecurityNumber,int Salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
        this.Salary=Salary;
    }
    @Override
    public double getPaymenyAmount() {
        return Salary;
    }  
    public String toString(){
        return("Employee: "+"\nFirstname: "+firstName+"\nlast name: "+lastName+"\nSocial security number: "+socialSecurityNumber+"Salary: "+Salary);
    }  
    public String getFirstname(){
        return firstName;
    }
}
class SalariedEmployee extends Employees{
    private double weeklysalary;
    SalariedEmployee(String firstName,String lastName,String socialSecurityNumber,int Salary,double weeklysalary){
        super(firstName, lastName, socialSecurityNumber,Salary);
        this.weeklysalary=weeklysalary;
    }
    @Override
    public double getPaymenyAmount(){
        return weeklysalary;
    }
    public String toString(){
        return ("SalariedEmployee: "+"\nWeekly Salary: "+weeklysalary);
    }
}
public class Task_2{
    public static void main(String[] args) {
        Payable in=new Invoice("23-05","toothpaste",23,45);
        Payable e=new Employees("Yasir","Ali","234-B-56",100000);
        Payable se=new SalariedEmployee("usman","ahmed","234-k9",890000,3400); 
        callforpayement(in);
        callforpayement(e);
        callforpayement(se);   
        callforstring(in);
        callforstring(e);
        callforstring(se);    
    }
    public static void callforpayement(Payable x){
        System.out.println("Payment : "+x.getPaymenyAmount());
    }
    public static void callforstring(Payable s){
        System.out.println(s.toString());
    }
}
