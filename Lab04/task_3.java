import java.util.Scanner;
class Fraction{
    public int nominator;
    public int denominator;
    public Fraction(){
        nominator=9;
        denominator=7;
    }
    public Fraction(int i,int j){
        nominator=i;
        denominator=j;
    }
    public void setNominator(int i){
        nominator=i;
    }
    public void setDenominator(int j){
        denominator=j;
    }
    public double getNominator(){
        return nominator;
    }
    public double getDenominator(){
        return denominator;
    }
    public void display(){
        System.out.println("the ration of two integer is "+nominator+" / "+denominator);
    }
    public boolean equals(Fraction temp){
        int n1,n2;
        int n3,n4;
        int n5=1;
        for(int i=2;i<=Math.min(nominator,denominator);i++){
            if((nominator%i==0)&&(denominator%i==0)){
                n5=i;
            }
        }
        n1=nominator/n5;
        n2=denominator/n5;
        int n6=1;
        for(int i=2;i<=Math.min(temp.nominator,temp.denominator);i++){
            if((temp.nominator%i==0)&&(temp.denominator%i==0)){
                n6=i;
            }
        }
        n3=temp.nominator/n6;
        n4=temp.denominator/n6;
        return (n1==n3&&n2==n4);
    }
}
public class task_3{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Fraction f1=new Fraction();
        Fraction f2=new Fraction(12,7); 
        f1.setNominator(2);
        f1.setDenominator(4);
        f2.setNominator(23);
        f2.setDenominator(7);
        f1.getNominator();
        f1.getDenominator();
        f2.getNominator();
        f2.getDenominator();
        f1.display();
        f2.display();
        System.out.print("\nEnter the Nominator: ");
        int num1,num2;
        num1=input.nextInt();
        System.out.print("\nEnter the value of denominator: ");
        num2=input.nextInt();
        Fraction otherfraction=new Fraction(num1,num2);   
        if(f1.equals(otherfraction)){
            System.out.println(f1.nominator+"/"+f1.denominator+" is equal to "+otherfraction.nominator+"/"+otherfraction.denominator);

        }
        else{
            System.out.println(f1.nominator+"/"+f1.denominator+" is not equal to "+otherfraction.nominator+"/"+otherfraction.denominator);
            
        }
        input.close();
    }   
}
