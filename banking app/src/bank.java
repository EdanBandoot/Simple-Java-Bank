import java.util.Scanner;

public class bank {
    /*
     * Things to add
     * 1. Currency conversion using apis
     * 2. Error handling
     * 3. Mortgage/Loan Calculations
     * 4. ????
     */
    static savingsAccount savings = new savingsAccount();
    static chequingAccount chequing = new chequingAccount();
    static Scanner directUserInput = new Scanner(System.in);
    static double tempNumberStorage = 0;
    static String userInput;
    static boolean isBanking = true;

    static void startupDialogue() {
        System.out.printf("Savings Account %nChequing Account %nDeposit %nWithdraw %nExit %n");
        System.out.println("Please enter your desired action");
        userInput = directUserInput.nextLine();

    }

    static void endingDialogue() {
        System.out.println("Would you like to continue banking?");
        System.out.println("Please respond with a Yes or No");
        System.out.println();
        userInput = directUserInput.nextLine();
        userInput = directUserInput.nextLine();
        if (userInput.equalsIgnoreCase("No")) {
            System.out.println("Thank you for banking with us!");
            isBanking = false;
            System.exit(0);
        }
    }

    static void endingDialogueNoDouble() {
        System.out.println("Would you like to continue banking?");
        System.out.println("Please respond with a Yes or No");
        System.out.println();
        userInput = directUserInput.nextLine();
        if (userInput.equalsIgnoreCase("No")) {
            System.out.println("Thank you for banking with us!");
            isBanking = false;
            System.exit(0);
        }
    }

    static void deposit() {
        userInput = "placeholder";
        System.out.printf("%n%n");
        System.out.println("Which account would you like to deposit into?");
        System.out.printf("Savings Account %nChequing Account");
        System.out.println();
        userInput = directUserInput.nextLine();
        if (userInput.equalsIgnoreCase("Savings Account")) {
            userInput = "placeholder";
            System.out.println("How much would you like to deposit into your savings account?");
            System.out.println();
            tempNumberStorage = directUserInput.nextDouble();
            double updatedBalance = savings.getSavingsBalance() + tempNumberStorage;
            savings.setSavingsBalance(updatedBalance);
            System.out.println("Deposit successful. New savings balance: " + savings.getSavingsBalance());
            endingDialogue();
        }

        else if (userInput.equalsIgnoreCase("Chequing Account")) {
            userInput = "placeholder";
            System.out.println("How much would you like to deposit into your chequing account?");
            System.out.println();
            tempNumberStorage = directUserInput.nextDouble();
            double updatedBalance = chequing.getChequingBalance() + tempNumberStorage;
            chequing.setChequingBalance(updatedBalance);
            System.out.println("Deposit successful. New savings balance: " + chequing.getChequingBalance());
            userInput = "placeholder";
            endingDialogue();

        }

    }

    static void withdraw() {
        userInput = "placeholder";
        System.out.printf("%n%n");
        System.out.println("Which account would you like to withdraw from?");
        System.out.printf("Savings Account %nChequing Account");
        System.out.println();
        userInput = directUserInput.nextLine();
        if (userInput.equalsIgnoreCase("Savings Account")) {
            userInput = "placeholder";
            System.out.println("How much would you like to withdraw from your savings account?");
            System.out.println();
            tempNumberStorage = directUserInput.nextDouble();
            double updatedBalance = savings.getSavingsBalance() - tempNumberStorage;
            savings.setSavingsBalance(updatedBalance);
            System.out.println("Withdraw successful. New savings balance: " + savings.getSavingsBalance());
            userInput = "placeholder";
            endingDialogue();
        }

        else if (userInput.equalsIgnoreCase("Chequing Account")) {
            userInput = "placeholder";
            System.out.println("How much would you like to withdraw from your chequing account?");
            System.out.println();
            tempNumberStorage = directUserInput.nextDouble();
            double updatedBalance = chequing.getChequingBalance() - tempNumberStorage;
            chequing.setChequingBalance(updatedBalance);
            System.out.println("Withdraw successful. New savings balance: " + chequing.getChequingBalance());
            userInput = "placeholder";
            endingDialogue();

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to our bank!");
        while (isBanking) {

            startupDialogue();

            if (userInput.equalsIgnoreCase("Deposit")) {
                deposit();
            } else if (userInput.equalsIgnoreCase("Withdraw")) {
                withdraw();
            } else if (userInput.equalsIgnoreCase("Savings Account")) {
                System.out.println("Your savings balance is " + savings.getSavingsBalance());
                endingDialogueNoDouble();
            } else if (userInput.equalsIgnoreCase("Chequing Account")) {
                System.out.println("Your chequing balance is " + chequing.getChequingBalance());
                endingDialogueNoDouble();
            } else if (userInput.equalsIgnoreCase("Exit")) {
                endingDialogueNoDouble();
            } else if (userInput.equalsIgnoreCase("Welcome to our bank!")) {
                System.out.println("That's not an option silly!");
                endingDialogueNoDouble();
            }

        }
    }
}