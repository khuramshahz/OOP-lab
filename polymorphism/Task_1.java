class Package{
    private String sender_address;
    private String sender_name;
    private String receiver_address;
    private String receiver_name;
    private double weight;
    private double cost_per_ounce;
    public Package(String sender_address, String sender_name, String receiver_address, String receiver_name, double weight, double cost_per_ounce) {
        this.sender_address = sender_address;
        this.sender_name = sender_name;
        this.receiver_address = receiver_address;
        this.receiver_name = receiver_name;
        this.weight = weight;
        this.cost_per_ounce = cost_per_ounce;
    }
    public double calculateCost(){
        return weight*cost_per_ounce;
    }
    public String toString(){
        return ("Package : "+"\nSeneder address: "+sender_address+"\nReceiver address: "+receiver_address+"Sender name: "+sender_name+"\nreceiver name: "+receiver_name+" cost per ounce: "+cost_per_ounce+"\nWeight: "+weight);
    }  
} 
class twodayPackage extends Package{
     private double flat_fee;
    public twodayPackage(double flat_fee, String sender_address, String sender_name, String receiver_address, String receiver_name, double weight, double cost_per_ounce) {
        super(sender_address, sender_name, receiver_address, receiver_name, weight, cost_per_ounce);
        this.flat_fee = flat_fee;
    }
    @Override
    public double calculateCost() {
        return super.calculateCost()+flat_fee; 
    }  
    public String toString(){
        return ("two day package"+flat_fee);
    } 
}
class OverweightPackage extends Package{
     private double additional_fee;

    public OverweightPackage(double additional_fee, String sender_address, String sender_name, String receiver_address, String receiver_name, double weight, double cost_per_ounce) {
        super(sender_address, sender_name, receiver_address, receiver_name, weight, cost_per_ounce);
        this.additional_fee = additional_fee;
    }
    @Override
    public double calculateCost() {
        return super.calculateCost()+additional_fee; 
    } 
    public String toString(){
        return ("overweight Package: "+additional_fee);
    }   
}
public class Task_1{
    public static void main(String[] args) {
       Package p=new Package("street#23","khuram","street#34","ali",23,3);
       Package tw=new twodayPackage(450,"street#3 city : Lahore","shahzad","street#4","ali",23,3);
       Package op=new OverweightPackage(45,"street#3 city:karachi ","shahzad","street#4","ali",23,3);
        System.out.println(op.calculateCost());
        System.out.println(tw.calculateCost());
        call (p);
        call(op);
        call(tw);
    }
    public static void call(Object x){
        System.out.println(x.toString());
    }
    
}