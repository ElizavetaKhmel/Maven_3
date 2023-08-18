package ru.netology.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.service.StatsService;

public class StatsServiceTest {

    @Test
    void shouldcalcSum() {
        StatsService service = new StatsService(); //сумма всех продаж
        int[] sell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.monthlyAmountSell(sell);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageMontlySell() {
        StatsService service = new StatsService(); // средняя сумма продаж
        int[] sell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.getAverageMonthlySell(sell);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService(); //месяц с минимумом продаж
        int[] sell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sell);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService(); // месяц с максимумом продаж
        int[] sell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sell);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthHigherAverage() {
        StatsService service = new StatsService(); // месяц с максимумом продаж
        int[] sell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.getMonthHigherAverageSell(sell);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthLowerAverage() {
        StatsService service = new StatsService(); // месяц с минимумом продаж
        int[] sell = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.getMonthLowerAverageSell(sell);

        Assertions.assertEquals(expected, actual);
    }
}



