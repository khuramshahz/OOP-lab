class Point{
    private int x,y;
    public Point(){
        x=0;
        y=0;
    }
    public Point (int a,int b){
        x=a;
        y=b;
    }
    public void setX(int a){
        x=a;
    }
    public void setY(int b){
        y=b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void display(){
        System.out.println("X coordinate is : "+x+" y coordinate is "+y);
    }
    public void movepoint(int a,int  b){
        x=a;
        y=b;
    }
}
public class Activity_3{
    public static void main(String[] args) {
        Point p1=new Point();
        p1.setX(10);
        p1.setY(15);
        p1.display();;
        Point p2=new Point(34,90);
        p2.movepoint(67, 966);
        p2.display();
    }
}
