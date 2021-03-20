package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.calculateSum(sales);

        System.out.println("Сумма всех продаж: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void findAverageSum() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.findAverageSum(sales);

        System.out.println("Средняя сумма продаж в месяц: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void findNumLastMaxMonth() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.findNumLastMaxMonth(sales);

        System.out.println("Номер последнего месяца с максимальной суммой продажи: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void findNumLastMinMonth() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.findNumLastMinMonth(sales);

        System.out.println("Номер последнего месяца с минимальной суммой продажи: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void findCountMonthUnderAverageSum() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.findCountMonthUnderAverageSum(sales);

        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void findCountMonthOverAverageSum() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.findCountMonthOverAverageSum(sales);

        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + actual);
        assertEquals(expected, actual);
    }
}
