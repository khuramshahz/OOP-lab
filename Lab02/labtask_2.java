class Account{
    int balance;
    Account(){
        balance=90;
    }
    Account(int value1,int value2){
        balance=value1;
    }
    void Deposit(int add){
        balance=balance+add;
    }
    void Withdraw(int deduct){
        balance=balance-deduct;
    }
}
public class labtask_2{
    public static void main(String[] args) {
        Account user=new Account();
        System.out.println(user.balance);
        user=new Account(45,89);
        System.out.println(user.balance);
        user.Deposit(56);
        System.out.println(user.balance);
        user.Withdraw(23);
        System.out.println(user.balance);   
    }  
}
