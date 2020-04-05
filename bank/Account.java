package bank;

public class Account {
    private double balance;
    private double recentDep = 0; // holds recent deposit amount
    private double recentWith = 0; // holds recent withdraw amount
    private double recentTrans = 0; // holds recent transferred amount

    public Account(double init_balance){
        this.setBalance(init_balance);
    }
    public double getRecentDep(){
        return this.recentDep;
    }
    public double getRecentWith(){
        return this.recentWith;
    }
    public double getRecentTrans(){
        return this.recentTrans;
    }
    public void showHistory(){
        System.out.println("History:");
        System.out.println("Recent deposit: " + this.getRecentDep());
        System.out.println("Recent withdraw: " + this.getRecentWith());
        System.out.println("Recent transaction: " + this.getRecentTrans());
    }
    public void setBalance(double bal){
        this.balance = bal;
    }
    public double getBalance(){return this.balance;}
    public boolean deposit(double amt){
        if (amt <= 0){
            return false;
        }
        else{
            this.balance += amt;
            this.recentDep = amt;
            return true;
        }
    }
    public boolean withdraw(double amt){
        if (amt > this.balance || amt <= 0){
            return false;
        }
        else{
            this.balance -= amt;
            this.recentWith = amt;
            return true;
        }
    }
    @Override
    public String toString(){
        return "Account balance: " + this.getBalance();
    }
    public void transfer(int amt, Account account){
        if (account != this && amt > 0){
            this.balance -= amt;
            account.balance += amt;
            this.recentTrans = amt;
            System.out.println("Transferred!");
        }
        else{
            if (account == this){
                System.out.println("Can't transfer to your own account! That's cheating :(");
            }
            if (amt <= 0){
                System.out.println("Amount cannot be zero or less than zero.");
            }
        }

    }

}
