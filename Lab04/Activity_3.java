class Point{
    private int x;
    private int y;
    public Point(){
        x=5;
        y=6;
    }
    public Point(int a,int b){
        x=a;
        y=b;
    }
    public void Setx(int a){
        x=a;
    }
    public void Sety(int b){
        y=b;
    }
    public int Getx(){
        return x;
    }
    public int Gety(){
        return y;
    }
    public Point Add(Point pa,Point pb){
        Point p_new=new Point(x+pa.x+pb.x, y+pb.y+pa.y);
        return p_new;

    }
    public void display(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class Activity_3{
    public static void main(String[] args) {
        Point p1=new Point(10,20);
        Point p2=new Point(30,40);
        Point p3=new Point();
        Point p4=p1.Add(p2,p3);
        p4.display();

    }
    
}
