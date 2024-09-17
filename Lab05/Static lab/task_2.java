class SavingsAccount{
    static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(){
        savingsBalance=2000;
    }
    public SavingsAccount(double am){
        if(am<0){
            System.out.println("The amount is not valid");
            savingsBalance=0;
        }
        else{
            savingsBalance=am;
        }  
    }
    public double calculateMonthlyInterest(){
        double interest=((savingsBalance*annualInterestRate)/12);
        savingsBalance=savingsBalance+interest;
        return interest;
    }
    public void show(){
        System.out.printf("%s%6.2f","The balance is ",savingsBalance);
        System.out.println();
    }
}
public class task_2{
    public static void main(String[] args) {
        SavingsAccount saver1=new SavingsAccount();
        SavingsAccount saver2=new SavingsAccount(3000);
        SavingsAccount.annualInterestRate=3;
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1.show();
        saver2.show();
        SavingsAccount.annualInterestRate=4;
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1.show();
        saver2.show();
    }
}
