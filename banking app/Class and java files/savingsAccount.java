public class savingsAccount {
    private double savingsBalance;

    // Constructor to initialize balance
    public savingsAccount() {
        this.savingsBalance = 0.0;
    }

    // Getter for savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Setter for savings balance
    public void setSavingsBalance(double amount) {
        this.savingsBalance = amount;
    }
}