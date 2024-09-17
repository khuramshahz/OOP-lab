import java.util.Scanner;
class Calculator{
    public static int sum(){
        Scanner input=new Scanner(System.in);
        int total=0;
        System.out.print("Enter the number of value wanted to sum: ");
        int number=input.nextInt();
        for(int i=0;i<number;i++){
            System.out.print("\nEnter the value : ");
            int value=input.nextInt();
            total=total+value;
        }
        input.close();
        return total;
    }
    public static int multiply(){
        int mul_total=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of value wanted to Multipy: ");
        int number=input.nextInt();
        for(int i=0;i<number;i++){
            System.out.print("\nEnter the value : ");
            int value=input.nextInt();
            mul_total=mul_total*value;
        }
        input.close();
        return mul_total;
    }
    public static double divide(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the first value for division: ");
        double num1=input.nextDouble();
        System.out.print("\nEnter the second value : ");
        double num2=input.nextDouble();
        while(num2==0){
            System.out.println("Wrong number !");
            System.out.print("Enter the second value again:  ");
            num2=input.nextDouble();
        }
        input.close();
        return (num1/num2);
    }
    public static double sin(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value to find the sine: ");
        double value=input.nextDouble();
        input.close();
        return (Math.sin(Math.toRadians(value)));
    } 
    public static double cos(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value to find the Cose: ");
        double value=input.nextDouble();
        input.close();
        return (Math.cos(Math.toRadians(value)));
    }
    public static double tan(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value to find the tan: ");
        double value=input.nextDouble();
        input.close();
        return (Math.tan(Math.toRadians(value)));
    }
    public static double modulus(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the first value for modulus: ");
        double num1=input.nextDouble();
        System.out.print("\nEnter the second value : ");
        double num2=input.nextDouble();
        input.close();
        return (num1%num2);
    }
}
public class task_3{
    public static void main(String[] args) {
        System.out.println("The sum of numbers are : "+Calculator.sum());
        System.out.println("The mutiplication of numbers are : "+Calculator.multiply());
        System.out.printf("%s%4.2f%s","The division of two number is : ",Calculator.divide(),"\n");
        System.out.printf("%s%4.5f%s","The sine value  of the number is :  ",Calculator.sin(),"\n");
        System.out.printf("%s%4.2f%s","The Cose value  of the number is :  ",Calculator.cos(),"\n");
        System.out.printf("%s%10.2f%s","The tan value  of the number is :  ",Calculator.tan(),"\n");
        System.out.printf("%s%10.2f%s","The tan value  of the number is :  ",Calculator.modulus(),"\n");   
    }
}
