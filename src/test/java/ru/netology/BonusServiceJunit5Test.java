package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceJunit5Test {

    BonusService bonusServiceJunit5Test = new BonusService();


    @Test
    public void shouldLeftToByeForCashback700() {

        int actual = bonusServiceJunit5Test.remain(700);
        int expected = 300;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLeftToByeForCashback1001() {

        int actual = bonusServiceJunit5Test.remain(1001);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }
}
