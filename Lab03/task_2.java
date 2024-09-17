class Account{
    private int balance;
    Account(){
        balance=34000;
    }
    Account(int amount){
        balance=amount;
    }
    public int get(){
        int tem=balance;
        return tem;
    }
    public void deposit(int amount){
        if(amount<0){
            System.out.println("The amount you  want to deposit is not valid");
        }else{
            balance=balance+amount;
        }
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("The amount you want to withdraw  is not valid ");
        }
        else{
            balance=balance-amount;
        }
    }
    public void display(){
        System.out.print(balance);
    }
}
public class task_2{
    public static void main(String[] args) {
        Account acc_1=new Account();
        Account acc_2=new Account(acc_1.get());
        acc_1.deposit(-2300);
        acc_1.withdraw(23000);
        acc_2.deposit(45000);
        acc_2.withdraw(100000);
        System.out.print("The amount in balance 1 is : ");
        acc_1.display();
        System.out.print("\nThe amount in balance 2 is : ");
        acc_2.display();
    }
}
