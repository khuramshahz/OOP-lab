class Point{
    int x;
    int y;
    Point(){
        x=3;
        y=7;
    }
    Point(int a,int b){
        x=a;
        y=b;
    }
    public void tricky(Point pa,Point pb){
        Point tem=pa;
        pa=pb;
        pb=tem;
        System.out.println("X: "+pa.x+" Y: "+pa.y);
        System.out.println("X: "+pb.x+" Y: "+pb.y);
    }
}
public class lec_4_2{
    public static void main(String[]args){
        Point p1=new Point();
        Point p2=new Point(3,8);
        System.out.println("X: "+p1.x+" Y: "+p1.y);
        System.out.println("X: "+p2.x+" Y: "+p2.y);tricky(p1,p2);
        System.out.println("X: "+p1.x+" Y: "+p1.y);
        System.out.println("X: "+p2.x+" Y: "+p2.y);
    }
}