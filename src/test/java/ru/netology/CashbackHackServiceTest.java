package ru.netology;

import org.junit.Test;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    @Test
    public void сash500() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 500;


        int actual = cashbackHackerService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }
    @Test
    public void сash999() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 999;


        int actual = cashbackHackerService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void сash1000() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 1000;


        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void сash1() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 1;


        int actual = cashbackHackerService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @Test
    public void сash1001() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 1001;


        int actual = cashbackHackerService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }


    @Test
    public void сash50() {
        CashbackHackService cashbackHackerService = new CashbackHackService();
        int amount = 50;


        int actual = cashbackHackerService.remain(amount);
        int expected = 950;

        assertEquals(actual, expected);
    }

}



