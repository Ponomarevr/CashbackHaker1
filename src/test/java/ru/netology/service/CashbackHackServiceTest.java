package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void AmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 750;
        int expected = 250;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void AmountEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void AmountGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1750;
        int expected = 250;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void WithZeroAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

}