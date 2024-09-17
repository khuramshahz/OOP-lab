class Circle{
    public double radius;
    Circle(){
        radius=4;
    }
    Circle(double pi,double r){
        radius=r;
    }
    public double calculateCircumference(){
        double calculate=2*3.14*radius;
        return calculate;
    }
}
public class labtask_1{
    public static void main(String[] args) {
        Circle r1=new Circle();
        Circle r2=new Circle(3.14,67);
        double CirF=r1.calculateCircumference();
        System.out.println("The Circumference of circle 1 is "+CirF);
        CirF=r2.calculateCircumference();
        System.out.println("The Circumference of circle 2 is "+CirF);   
    }
}
