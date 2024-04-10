package com.example.bank;
import java.util.Map;
import java.util.logging.Logger;

public class App {
	private static final Logger logger = Logger.getLogger(Map.class.getName());
    private static double balance = 60;
    private static double interestRate = 0.05; // Assuming 5% interest rate

    public static double calculateBalance() {
        return balance;
    }

    public static double calculateWithdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return 0;
        }
        balance -= amount;
        return amount;
    }

    public static double calculateDeposit(double amount) {
        balance += amount;
        return balance;
    }

    public static double calculateInterest() {
        return balance * interestRate;
    }

    public static boolean isBalanceBelow(double threshold) {
        return balance < threshold;
    }

    public static void clearBalance() {
        balance = 0;
    }

    public static boolean isBalanceNegative() {
        return balance < 0;
    }

    public static void main(String[] args) {
    	logger.info("Initial balance: " + calculateBalance());
        logger.info("Withdrawn: " + calculateWithdraw(10));
        logger.info("New balance after withdrawal: " + calculateBalance());
        logger.info("Deposited: " + calculateDeposit(20));
        logger.info("New balance after deposit: " + calculateBalance());
        logger.info("Interest earned: " + calculateInterest());
        logger.info("Is balance below 50? " + isBalanceBelow(50));
        logger.info("Is balance negative? " + isBalanceNegative());
        clearBalance();
        logger.info("Balance after clearing: " + calculateBalance());
    }
}
