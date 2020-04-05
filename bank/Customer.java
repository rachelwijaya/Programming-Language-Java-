package bank;


public class Customer {
    private String firstName, lastName;
    private Account account;

    public Customer(String f, String l){
        this.setFirstName(f);
        this.setLastName(l);
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public Account getAccount(){
        return this.account;
    }
    public void setFirstName(String f){
        this.firstName = f;
    }
    public void setLastName(String l){
        this.lastName = l;
    }
    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }

    public void setAccount(Account account) {
        if (this.account == null) {
            this.account = account;
    }
    }
    @Override
    public String toString(){
        return "Customer: " + this.getFullName() + "\n" + this.getAccount().toString();
    }
}
