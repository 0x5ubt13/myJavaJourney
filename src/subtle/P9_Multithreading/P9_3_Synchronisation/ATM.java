package subtle.P9_Multithreading.P9_3_Synchronisation;

public class ATM {
    
    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if((balance - amount) < - account.getOverdraft()) {
            System.out.println("Transaction denied!");
        } else {
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());
    }
}
