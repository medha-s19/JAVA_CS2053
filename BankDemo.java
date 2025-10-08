abstract class Account {
    abstract void display();
}

class SavingsAccount extends Account {
    void display() {
        System.out.println("This is a Savings Account");
    }
}

class CurrentAccount extends Account {
    void display() {
        System.out.println("This is a Current Account");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount();  // polymorphism
        Account a2 = new CurrentAccount();  // polymorphism

        a1.display();
        a2.display();
    }
}
