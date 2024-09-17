import javax.annotation.processing.SupportedSourceVersion;

class Circle{
    private int radius;
    public Circle(){
        radius=7;
    }
    public Circle(int r){
        radius=r;
    }
    public void setradius(int r){
        radius=r;
    }
    public int getradius(){
        return radius;
    }
    public void display(){
        System.out.println("radius="+radius);
    }
    public double CalculateCircumference(){
        double a=3.14*radius*radius;
        return a;
    }
}
public class Activity_1{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setradius(5);
        System.out.println("Circumference of circle 1 is :"+c1.CalculateCircumference());
        int r=c1.getradius();
        Circle c2=new Circle(r);
        c2.setradius(5);
        System.out.println("Circumference of circle 2 is : "+c2.CalculateCircumference());   
    }
}
