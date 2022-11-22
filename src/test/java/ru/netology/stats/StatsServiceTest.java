package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    int[] sales = {4, 8, 15, 16, 23, 42, 55, 66, 77, 88, 99, 21};

    @Test
    void amountSaleTest() {
        StatsService service = new StatsService();

        int actual = service.amountSales(sales);
        int expect = 514;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void averageSaleTest() {
        StatsService service = new StatsService();

        int actual = service.averageSales(sales);
        int expect = 42;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void monthWithMinSalesTest() {
        StatsService service = new StatsService();

        int actual = service.monthWithMinSales(sales);
        int expect = 1;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void monthWithMaxSalesTest() {
        StatsService service = new StatsService();

        int actual = service.monthWithMaxSales(sales);
        int expect = 11;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void sumMonthWithMaxSalesTest() {
        StatsService service = new StatsService();

        int actual = service.amountMonthWithMaxSales(sales);
        int expect = 5;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void sumMonthWithMinSalesTest() {
        StatsService service = new StatsService();

        int actual = service.amountMonthWithMinSales(sales);
        int expect = 6;
        Assertions.assertEquals(expect, actual);
    }
}