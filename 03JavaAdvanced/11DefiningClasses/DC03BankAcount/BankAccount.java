package DC03BankAcount;

public class BankAccount {
    // два статична члена, които с еднакви за всички интстанции (обекти):
    // 1. Номер на бакова сметка:
    private static int accountsCount = 1;
    // 2. Лихва, която е еднаква за всички банкови сметки:
    private static double interestRate = 0.02;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = accountsCount;
        accountsCount++;
    }

    public int getId() {
        return this.id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {

        return this.balance * years * interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }


}
