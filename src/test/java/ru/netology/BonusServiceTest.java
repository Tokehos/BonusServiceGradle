package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BonusServiceTest {

    BonusService bonusService = new BonusService();

    @Test
    public void shouldLeftToByeForCashback800() {
        int actual = bonusService.remain(800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeftToByeForCashback1000() {
        int actual = bonusService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeftToByeForCashback1001() {
        int actual = bonusService.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldLeftToByeForCashback999() {
        int actual = bonusService.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }
}