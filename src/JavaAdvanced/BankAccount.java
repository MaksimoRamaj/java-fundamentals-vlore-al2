package JavaAdvanced;

public class BankAccount {

    private String accountNum;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNum, int balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositMoney(double amount) {

        if (amount>0){
            balance+=amount;
            System.out.println(amount+" deposited successfully on bank account "+ getAccountNum()+ " !");
        }
        else System.out.println("Invalid ammount, please enter an amount!");
    }

    public void withdrawMoney(double amount) throws IllegalArgumentException {

        if (amount>0){
            if (balance>=amount){
                balance-=amount;
                System.out.println(amount+" withdrawn succesfully on bank account "+ getAccountNum()+ " !");
            }
            else {
                System.out.println("Not enough founds");
            }
        }

        else {
            throw new IllegalArgumentException("Invalid withdrawal amount!");
        }
    }

    public double checkBalance() {
            return getBalance();
    }
}
