package com.example.bank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCalculateBalance() {
        double expectedBalance = 50; 
        double actualBalance = App.calculateBalance(); 

        
        assertEquals(expectedBalance, actualBalance, 0.001); 
    }

    @Test
    public void testCalculateDeposit() {
        double expectedDeposit = 80; 
        double actualDeposit = App.calculateDeposit(); 

       
        assertEquals(expectedDeposit, actualDeposit, 0.001); 
    }
}
