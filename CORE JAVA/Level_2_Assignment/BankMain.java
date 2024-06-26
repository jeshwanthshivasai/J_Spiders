class Bank {
    public void openAccount() {
        System.out.println("Opening Account");
        Account.displayAccountDetails();
    }
    public void closeAccount() {
        System.out.println("Closing Account");
    }
    public static void checkBalance() {
        System.out.println("Checking Balance");
        Account.transferFunds();
    }
}
class Account {
    public static void displayAccountDetails() {
        System.out.println("Displaying Account Details");
        Bank.checkBalance();
    }
    public static void transferFunds() {
        System.out.println("Transferring Funds");
    }
}
class Transaction {
    public static void logTransaction() {
        System.out.println("Logging Transaction");
        Bank b1 = new Bank();
        b1.openAccount();
    }
    public void processTransaction() {
        System.out.println("Processing Transaction");
        Bank b2 = new Bank();
        b2.closeAccount();
    }
}
class BankMain {
    public static void main(String[] args) {
        Transaction.logTransaction();
        Transaction t1 = new Transaction();
        t1.processTransaction();
    }
}
