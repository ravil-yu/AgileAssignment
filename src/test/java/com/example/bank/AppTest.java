package com.example.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCalculateBalance() {
        assertEquals(100, App.calculateBalance(), 0.001); 
    }

    @Test
    public void testCalculateWithdrawSufficientBalance() {
        assertEquals(50, App.calculateWithdraw(50), 0.001); 
    }

    @Test
    public void testCalculateWithdrawInsufficientBalance() {
        assertEquals(0, App.calculateWithdraw(200), 0.001); 
    }

    @Test
    public void testCalculateDeposit() {
        assertEquals(100, App.calculateDeposit(100), 0.001); 
    }

    @Test
    public void testIsBalanceBelow() {
        assertTrue(App.isBalanceBelow(200)); 
    }

    @Test
    public void testIsBalanceNotBelow() {
        assertFalse(App.isBalanceBelow(50)); 
    }

    @Test
    public void testIsBalanceNegative() {
        assertFalse(App.isBalanceNegative()); 
    }
}
