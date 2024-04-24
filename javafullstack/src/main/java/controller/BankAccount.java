package controller;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Depost of $" + amount + " Successful New balance: $" + balance);
        }
        else{
            System.out.println("Invalid amount to deposit");
        }
    }

    public void withdraw(double amount){
        if(amount >0 && amount <= balance){
            balance -=amount;
            System.out.println("Withdraw of $" + amount + " Successful New balance: $" + balance);
        }else{
            System.out.println("Invalid amount to withdraw");
        }
    }

    public  static void main(String[]  argc){
        BankAccount ba = new BankAccount("1234567", 1000);
        ba.setAccountNumber("987");
        ba.setBalance(2000);
        ba.deposit(500);
        ba.withdraw(2000);
        ba.withdraw(2500);
    }


}
