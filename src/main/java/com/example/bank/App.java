package com.example.bank;
import java.util.Map;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    private static double balance = 100;

    public static double calculateBalance() {
        return balance;
    }

    public static double calculateWithdraw(double withdraw) {
        try {
            if (withdraw > balance) {
                throw new IllegalArgumentException("Insufficient balance.");
            }else {
            return withdraw;}
        } catch (IllegalArgumentException e) {
            logger.warning(e.getMessage());
            return 0;
        }
    }

    public static double calculateDeposit(double deposit) {
        return deposit;
    }

    public static boolean isBalanceBelow(double threshold) {
        return balance < threshold;
    }

    public static boolean isBalanceNegative() {
        return balance < 0;
    }

    public static void main(String[] args) {
        
    }
}
