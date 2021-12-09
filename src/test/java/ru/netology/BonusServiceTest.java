package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class BonusServiceTest {
    BonusService bonusService = new BonusService();

    @Test
    public void shouldLeftToByeForCashback800() {
        int actual = bonusService.remain(800);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLeftToByeForCashback999() {
        int actual = bonusService.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLeftToByeForCashback1() {
        int actual = bonusService.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLeftToByeForCashback1000() {
        int actual = bonusService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }



}
