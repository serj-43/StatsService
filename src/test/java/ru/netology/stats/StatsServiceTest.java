package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    public long[] salesRep = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void CheckSumm() {
        StatsService service = new StatsService();
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.SaleSumm(salesRep);
        assertEquals(expected, actual);
    }

    @Test
    public void AvgSale() {
        StatsService service = new StatsService();
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.avgSalesMonth(salesRep);
        assertEquals(expected, actual);
    }

    @Test
    public void CheckMax() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.maxSalesMonth(salesRep);
        assertEquals(expected, actual);
    }

    @Test
    public void CheckMin() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.minSalesMonth(salesRep);
        assertEquals(expected, actual);
    }

    @Test
    public void CheckHigherAvg() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.higherAvgSalesMonth(salesRep);
        assertEquals(expected, actual);
    }

    @Test
    public void CheckLowerAvg() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.lowerAvgSalesMonth(salesRep);
        assertEquals(expected, actual);
    }
}
