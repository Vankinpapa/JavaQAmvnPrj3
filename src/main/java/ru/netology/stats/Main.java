package ru.netology.stats;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] sales = {4, 8, 15, 16, 23, 42, 55, 66, 77, 88, 99, 21};

        StatsService service = new StatsService();

        //Месяц с минимальной ценой:
        int min = service.monthWithMinSales(sales);
        System.out.println("Номер месяца с минимальной продажей: " + min);

        //Месяц с максимальной ценой:
        int max = service.monthWithMaxSales(sales);
        System.out.println("Номер месяца с минимальной продажей: " + max);

        //Сумма продаж:
        int amount = service.amountSales(sales);
        System.out.println("Сумма продаж: " + amount);

        //Минимальная продажа:
        int minMount = service.minSales(sales);
        System.out.println("Самая минимальная продажа: " + minMount);

        //Максимальная продажа:
        int maxMount = service.maxSales(sales);
        System.out.println("Самая максимальная продажа: " + maxMount);

        //Средняя сумма продаж:
        int averageSales = service.averageSales(sales);
        System.out.println("Средняя сумма продаж: " + averageSales);

        //Количество месяцев с продажей ниже среднего:
        int sumMonthWithSalesMinAverage = service.amountMonthWithMinSales(sales);
        System.out.println("Количество месяцев с продажей ниже среднего: " + sumMonthWithSalesMinAverage);

        //Количество месяцев с продажей выше среднего:
        int sumMonthWithSalesMaxAverage = service.amountMonthWithMaxSales(sales);
        System.out.println("Количество месяцев с продажей выше среднего: " + sumMonthWithSalesMaxAverage);

    }
}


