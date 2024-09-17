class Distance{
    private double inches;
    private double feet;
    public Distance(){
        inches=30;
        feet=90;
    }
    public Distance(double i,double f){
        inches=i;
        feet=f;
    }
    public void setInches(double i){
        inches=i;
    }
    public void setFeet(double f){
        feet=f;
    }
    public double getInches(){
        return inches;
    }
    public double getFeet(){
        return feet;
    }
    public Distance Add(Distance a){
        Distance tem=new Distance(inches+a.inches,feet+a.feet);
        return tem;
    }
    public void display(){
        System.out.println("Inches: "+inches+" Feet : "+feet);
    }
}
public class task_1{
    public static void main(String[] args) {
        Distance d1=new Distance();
        Distance d2=new Distance(23,67);
        Distance d3=new Distance();
        d1.setFeet(78.9);
        d1.setInches(89.7);
        d2.setFeet(8.5);
        d2.setInches(45.7);
        d1.getInches();
        d1.getFeet();
        d2.getFeet();
        d2.getInches();
        d3=d1.Add(d2);
        d1.display();
        d2.display();
        d3.display();   
    }
}
