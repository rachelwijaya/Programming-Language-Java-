package bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName){
        this.bankName = bName;
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f,l);
        Account acc = new Account(1500);
        customer.setAccount(acc);
        this.customers.add(customer);
        this.numberOfCustomers = customers.size();
    }
    public String getBankName(){
        return this.bankName;
    }
    public int getNumberOfCustomers() {
        return this.numberOfCustomers;
    }
    public Customer getCustomer (int index){
        return this.customers.get(index);
    }
    public void printCustomers(){
        for (int i = 0; i < this.getNumberOfCustomers(); i++){
            System.out.println(this.getCustomer(i).toString());
            System.out.println("-----------------------------");
        }

    }
    @Override
    public String toString(){
        return "Bank name: " + this.getBankName() + "\nNumber of customers: " + this.getNumberOfCustomers();
    }
}
