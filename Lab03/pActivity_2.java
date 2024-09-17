import javax.annotation.processing.SupportedSourceVersion;

class Rectangle{
    private int length,width;
    public Rectangle(){
        length=5;
        width=89;   
    }
    public Rectangle(int a,int b){
        length=a;
        width=b;
            
        }
    public void setlength(int a){
        length=a;

    }
    public void setwidth(int b){
        width=b;
    }
    public int getlength(){
        return length;
    }
    public int getwidth(){
        return width;
    }
    public int area(){
        return (length*width);
    }
}
public class pActivity_2{
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        rect.setlength(5);
        rect.setwidth(10);
        System.out.println("Area of rectangle is : "+rect.area());
        System.out.println("Width of rectangle is : "+rect.getwidth());
    }
}
