interface Shape 
{ 
 double getArea();
}
class Circle implements Shape{
    private double radius;
    Circle(){

    }
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return radius*radius*3.14;
    }
}
class Rectangle implements Shape{
    private double length;
    private double width;
    Rectangle(){

    }
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea() {
        return length*width;       
    }
}
public class Task_1{
    public static void main(String[] args) {
        Circle c=new Circle(12);
        Rectangle r=new Rectangle(12,34);
        System.out.println("Circle radius: "+c.getArea());
        System.out.println("rectangle radius : "+r.getArea());
    }
}
