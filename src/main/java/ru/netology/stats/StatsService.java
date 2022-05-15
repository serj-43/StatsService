package ru.netology.stats;

public class StatsService {
    public int SaleSumm(long[] sales) {
        int summ = 0;
        for (long sale : sales) {
            summ += sale;
        }
        return summ;
    }

    public int minSalesMonth(long[] sales) {
        int month = 1;
        long min = sales[0];
        int counter = 1;
        for (long sale : sales) {
            if (sale <= min) {
                min = sale;
                month = counter;
            }
            counter++;
        }
        return month;
    }

    public int maxSalesMonth(long[] sales) {
        int month = 1;
        long max = sales[0];
        int counter = 1;
        for (long sale : sales) {
            if (sale >= max) {
                max = sale;
                month = counter;
            }
            counter++;
        }
        return month;
    }

    public int avgSalesMonth(long[] sales) {
        return SaleSumm(sales) / sales.length;
    }

    public int higherAvgSalesMonth(long[] sales) {
        int avg = avgSalesMonth(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > avg) {
                counter++;
            }
        }
        return counter;
    }

    public int lowerAvgSalesMonth(long[] sales) {
        int avg = avgSalesMonth(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < avg) {
                counter++;
            }
        }
        return counter;
    }
}
