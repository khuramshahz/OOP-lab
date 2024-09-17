import javax.xml.transform.stream.StreamSource;

class Complex{
    private double real;
    private double image;
    public Complex(){
        real=0.0;
        image=0.0;
    }
    public Complex(double r,double im){
        real=r;
        image=im;
    }
    public Complex Add(Complex b){
        Complex c_new=new Complex(real+b.real, image+b.image);
        return c_new;
    }
    public void show(){
        System.out.println(real+" "+image);
    }
}
public class Activity_2{
    public static void main(String[] args) {
        Complex c1=new Complex(11,2.3);
        Complex c2=new Complex(9,2.3);
        Complex c3=new Complex();
        c3=c1.Add(c2);
        c3.show();
    }
    
}
