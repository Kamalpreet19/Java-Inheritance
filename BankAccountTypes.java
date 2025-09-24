/*Model a banking system with different account types using hierarchical inheritance. BankAccount is the 
superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes 
like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while 
inheriting from a shared superclass.
 */


class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Balance : " + balance);

    }

}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Interest Rate : " + interestRate);
        System.out.println();

    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Withdrawal limit : " + withdrawalLimit);
        System.out.println();
    }

}

class FixedDepositAccount extends BankAccount {
    int depositTerm;

    FixedDepositAccount(int accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Deposit term (in months) : " + depositTerm);
        System.out.println();
    }

}

public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount obj1 = new SavingsAccount(326356478, 98500, 0.25);
        BankAccount obj2 = new CheckingAccount(43758678, 347634, 20000);
        BankAccount obj3 = new FixedDepositAccount(76264738, 56000, 6);

        BankAccount banks[] = { obj1, obj2, obj3 };
        for (int i = 0; i < banks.length; i++) {
            banks[i].displayAccountType();
        }

    }
}
