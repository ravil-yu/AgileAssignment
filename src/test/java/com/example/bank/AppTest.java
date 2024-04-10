package com.example.bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testCalculateBalance() {
        assertEquals(60, App.calculateBalance(), 0.001); 
    }

    @Test
    public void testCalculateWithdrawSufficientBalance() {
        assertEquals(10, App.calculateWithdraw(10), 0.001);
        assertEquals(50, App.calculateBalance(), 0.001);
    }

    @Test
    public void testCalculateWithdrawInsufficientBalance() {
        assertEquals(0, App.calculateWithdraw(70), 0.001);
        assertEquals(50, App.calculateBalance(), 0.001); 
    }

    @Test
    public void testCalculateDeposit() {
        assertEquals(80, App.calculateDeposit(20), 0.001);
        assertEquals(80, App.calculateBalance(), 0.001);
    }

    @Test
    public void testCalculateInterest() {
        assertEquals(3, App.calculateInterest(), 0.001); 
    }

    @Test
    public void testIsBalanceBelowThreshold() {
        assertTrue(App.isBalanceBelow(70));
        assertFalse(App.isBalanceBelow(50));
    }

    @Test
    public void testClearBalance() {
        App.clearBalance();
        assertEquals(0, App.calculateBalance(), 0.001);
    }

    @Test
    public void testIsBalanceNegative() {
        assertFalse(App.isBalanceNegative());
        App.calculateWithdraw(70); 
        assertTrue(App.isBalanceNegative());
    }
}
