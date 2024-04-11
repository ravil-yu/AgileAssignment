package com.example.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCalculateBalance() {
        assertEquals(100.0, App.calculateBalance());
    }

    @Test
    public void testCalculateWithdrawSufficientBalance() {
        assertEquals(10.0, App.calculateWithdraw(10));
    }

    @Test
    public void testCalculateWithdrawInsufficientBalance() {
        assertEquals(0.0, App.calculateWithdraw(110));
        assertEquals(100.0, App.calculateBalance());
    }

    @Test
    public void testCalculateDeposit() {
        assertEquals(20.0, App.calculateDeposit(20));
    }

    @Test
    public void testIsBalanceNegative() {
        assertFalse(App.isBalanceNegative());
    }


}
