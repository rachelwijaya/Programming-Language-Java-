package bank;


public class BankingDriver {

    public static void main(String[] args) {
        // Let's create the bank itself first !
        Bank bank = new Bank("Wijaya Financial Inc");

        // We now shall create a few customers in our bank, they are then initialised there, and
        bank.addCustomer("Rachel", "Wijaya");
        bank.addCustomer("Rowin", "Faadhilah");
        bank.addCustomer("Clarissa", "Indriyani");
        bank.addCustomer("Jeconiah", "Richard");
        bank.addCustomer("Aimee", "Hartono");
        bank.addCustomer("Callista", "Luhur");


        // See info regarding our bank !
        System.out.println("Bank info");
        System.out.println("-------------------------");
        bank.printCustomers();
        System.out.println(bank.toString());
        System.out.println("-------------------------");


        // Transfer function
        System.out.println("Transfer function");
        System.out.println("-------------------------");
        bank.getCustomer(0).getAccount().transfer(100, bank.getCustomer(1).getAccount());
        // See info regarding the most recent deposit, withdraw and transfer
        bank.getCustomer(0).getAccount().showHistory();
        // See that the transferred balance is added to the other account
        System.out.println(bank.getCustomer(1).getAccount().toString());
        System.out.println("-------------------------");

        // Deposit function
        System.out.println("Deposit function");
        System.out.println("-------------------------");
        bank.getCustomer(3).getAccount().deposit(420);
        // Check if balance is updated, every account initially starts with 1500
        System.out.println(bank.getCustomer(3).getAccount().toString()); // new balance should be 1920.0
        System.out.println("-------------------------");

        // Withdraw function
        System.out.println("Withdraw function");
        System.out.println("-------------------------");
        bank.getCustomer(4).getAccount().withdraw(200);
        // Check if balance is updated, every account initially starts with 1500
        System.out.println(bank.getCustomer(4).getAccount().toString()); // new balance should be 1300.0
        System.out.println("-------------------------");


        // See if the old recent will be updated to the new recent deposit
        bank.getCustomer(3).getAccount().deposit(400); //should show 400 in the showHistory function now
        bank.getCustomer(3).getAccount().showHistory();
        System.out.println("-------------------------");

        // If we insert -100 in withdraw it should return false and account balance is not affected
        bank.getCustomer(5).getAccount().withdraw(-100);
        System.out.println(bank.getCustomer(5).getAccount().toString()); // balance should have still remain 1500
        System.out.println("-------------------------");

        // Let's test the deposit now
        bank.getCustomer(5).getAccount().deposit(-100);
        System.out.println(bank.getCustomer(5).getAccount().toString()); // balance should have still remain 1500
        System.out.println("-------------------------");

        // See if showHistory works for deposit, withdraw and transfer
        bank.getCustomer(5).getAccount().deposit(100);
        bank.getCustomer(5).getAccount().withdraw(230);
        bank.getCustomer(5).getAccount().transfer(400, bank.getCustomer(3).getAccount());
        bank.getCustomer(5).getAccount().showHistory();
        System.out.println(bank.getCustomer(5).getAccount().toString());
        System.out.println("-------------------------");

        // Doesn't allow transfer to your own account and amount cannot be bigger than balance or less thane equal to zero
        bank.getCustomer(5).getAccount().transfer(400, bank.getCustomer(5).getAccount());
        bank.getCustomer(5).getAccount().transfer(1800, bank.getCustomer(3).getAccount());
        bank.getCustomer(5).getAccount().transfer(-123, bank.getCustomer(3).getAccount());


    }
}
