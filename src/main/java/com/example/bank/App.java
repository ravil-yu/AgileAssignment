package com.example.bank;

public class App {

 
    public static double calculateBalance() {
        double balance = 60;
        double withdraw = 10;
        double finalBalance = balance - withdraw;
        return finalBalance;

    }

    public static double calculateDeposit() {
    	 double balance = 60;
    	 double input = 20;
         double deposit = input + balance;

         return deposit;
    }
    
    public static void main(String[] args) {
        System.out.println("balance="+calculateBalance()); 
        System.out.println("deposit="+calculateDeposit());
    }
}
