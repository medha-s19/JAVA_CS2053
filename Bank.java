class LowBalance extends Exception {
    LowBalance(String s) {
        super(s);
    }
}

class Bank {
    double balance = 5000;

    void withdraw(double amount) throws LowBalance {
        if (amount > balance) {
            throw new LowBalance("Not enough balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public static void main(String args[]) {
        Bank b = new Bank();
        try {
            try {
                b.withdraw(7000);
            } catch (LowBalance e) {
                System.out.println(e.getMessage());
            }

            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e);
            }

            System.out.println("Transaction done.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Thanks for banking with us!");
        }
        System.out.println("All operations completed smoothly.");
    }
}
