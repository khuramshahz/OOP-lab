abstract class Convert{
    protected double val1;
    protected double val2;
    public Convert(int val1) {
        this.val1 = val1;
    }
    public abstract void Compute();

    public double getVal2() {
        return val2;
    } 
    public void setVal2(double val2) {
        this.val2 = val2;
    }
}
class Liters_to_Gallons extends Convert{
    public Liters_to_Gallons(int val1) {
        super(val1);
    }
    @Override
    public void Compute() {
        val2=val1*0.2641;
    }
    @Override
    public double getVal2() {
        return super.getVal2();
    }
}
class farenhite_to_celsius extends Convert{
    public farenhite_to_celsius(int val1) {
        super(val1);
    }
    @Override
    public void Compute() {
        val2=(val1-32)*(0.5555);
    } 
    @Override
    public double getVal2() {
        return super.getVal2(); 
    } 
}
class FeetToMeter extends Convert{
    public FeetToMeter(int val1) {
        super(val1);
    }
    @Override
    public void Compute() {
        super.setVal2(super.val1*0.3048);
    }
    @Override
    public double getVal2() {
        return super.getVal2();
    }       
}
public class Task_3{
    public static void main(String[] args) {
        Convert fm=new FeetToMeter(90);
        Convert fts=new farenhite_to_celsius(130);
        Convert ltg=new Liters_to_Gallons(45);
        fm.Compute();
        fts.Compute();
        ltg.Compute();
        System.out.println(fm.getVal2());
        System.out.println(fts.getVal2());
        System.out.println(ltg.getVal2());   
    }
}
