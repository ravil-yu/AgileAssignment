package com.example.bank;

public class App {
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
        System.out.println("Initial balance: " + calculateBalance());
        System.out.println("Withdrawn: " + calculateWithdraw(10));
        System.out.println("New balance after withdrawal: " + calculateBalance());
        System.out.println("Deposited: " + calculateDeposit(20));
        System.out.println("New balance after deposit: " + calculateBalance());
        System.out.println("Interest earned: " + calculateInterest());
        System.out.println("Is balance below 50? " + isBalanceBelow(50));
        System.out.println("Is balance negative? " + isBalanceNegative());
        clearBalance();
        System.out.println("Balance after clearing: " + calculateBalance());
    }
}
