package ru.netology.stats;

public class StatsService {

    public int monthWithMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthWithMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int amountSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int minSales(int[] sales) {
        int minSale = sales[0];
        for (int i : sales) {
            if (i < minSale) {
                minSale = i;
            }
        }
        return minSale;
    }

    public int maxSales(int[] sales) {
        int maxSale = sales[0];
        for (int s : sales) {
            if (s > maxSale) {
                maxSale = s;
            }
        }
        return maxSale;
    }

    public int averageSales(int[] sales) {
        int average = amountSales(sales) / sales.length;
        return average;
    }

    public int amountMonthWithMinSales(int[] sales) {
        int averSales = averageSales(sales);
        int min = 0;
        for (int sale : sales) {
            if (sale < averSales) {
                min = min + 1;
            }

        }
        return min;
    }

    public int amountMonthWithMaxSales(int[] sales) {
        int averSales = averageSales(sales);
        int max = 0;
        for (int sale : sales) {
            if (sale > averSales) {
                max = max + 1;
            }

        }
        return max;
    }

}

