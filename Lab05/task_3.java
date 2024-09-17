class point{
    private double x_cord;
    private double y_cord;
    public point(){

    }
    public void setX(double x){
        x_cord=x;
    }
    public void setY(double y){
        y_cord=y;
    }
    public double getX(){
        return x_cord;
    }
    public double getY(){
        return y_cord;
    }
    public void display(){
        System.out.println("X-coordinate is : "+x_cord+" y-coordinate is : "+y_cord);
    }
}
class Line{
    private double start_point;
    private double end_point;
    private point p;
    public Line(){
        
    }
    public Line(double a,double b,point c){
        start_point=a;
        end_point=b;
        p=c;
    }
    public void setSpoint(double a){
        start_point=a;
    }
    public void setEpoint(double b){
        end_point=b;
    }
    private double Calculatelength(){
        double length=Math.sqrt((start_point-p.getX())+(end_point-p.getY()));
        return length;
    }
    public void display(){
        System.out.println("The length is : "+Calculatelength());
    }
}
public class task_3{
    public static void main(String[] args) {
        point p1=new point();
        p1.setX(56);
        p1.setY(34);
        p1.display();
        Line l1=new Line(78,99,p1);
        Line l2=new Line(100,103,p1);
        l1.display();
        l2.display();
    }
}
