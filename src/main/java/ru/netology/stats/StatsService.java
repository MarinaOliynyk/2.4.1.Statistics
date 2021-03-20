package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int findAverageSum(int[] sales) {
        int sum = calculateSum(sales);
        int sumAverage = sum / sales.length;

        return sumAverage;
    }


    public int findNumLastMaxMonth(int[] sales) {
        int currentMax = sales[0];
        int month = 0;
        int maxMonth = 0;
        for (int sale : sales) {
            month++;
            if (currentMax <= sale) {
                currentMax = sale;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public int findNumLastMinMonth(int[] sales) {
        int currentMin = sales[0];
        int month = 0;
        int minMonth = 0;
        for (int sale : sales) {
            month++;
            if (currentMin >= sale) {
                currentMin = sale;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int findCountMonthUnderAverageSum(int[] sales) {
        int average = findAverageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale < average)
                monthCount++;
        }
        return monthCount;
    }

    public int findCountMonthOverAverageSum(int[] sales) {
        int average = findAverageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale > average)
                monthCount++;
        }
        return monthCount;
    }
}