package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    BonusService bonusService = new BonusService();

    @Test
    public void remain() {
    int actual = bonusService.remain(800);
    int expected = 200;

    assertEquals(actual,expected);

    }
}