package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class BonusServiceTest {

    BonusService bonusService = new BonusService();

    @Test
    public void shouldLeftToByeForCashback999() {
        int actual = bonusService.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeftToByeForCashback1001() {
        int actual = bonusService.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeftToByeForCashback0() {
        int actual = bonusService.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeftToByeForCashback500() {
        int actual = bonusService.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }
}