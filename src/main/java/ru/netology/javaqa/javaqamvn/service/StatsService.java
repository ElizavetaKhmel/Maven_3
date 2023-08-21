package ru.netology.javaqa.javaqamvn.service;

public class StatsService {
    public int monthlyAmountSell(int[] sell) { // сумма всех продаж
        int sum = 0;
        for (int i = 0; i < sell.length; i++) {
            sum = sum + sell[i];
        }
        return sum;
    }

    public int getAverageMonthlySell(int[] sell) { // средняя сумма продаж
        int averageSell = monthlyAmountSell(sell) / sell.length;
        return averageSell;
    }

    public int minSales(int[] sell) { // месяц с минимумом продаж
        int minSales = 0;

        for (int i = 1; i < sell.length; i++) {
            if (sell[minSales] >= sell[i]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int maxSales(int[] sell) {  // месяц с максимумом продаж
        int maxMonth = 0;

        for (int i = 0; i < sell.length; i++) {
            if (sell[maxMonth] <= sell[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMonthLowerAverageSell(int[] sell) { //кол-во месяцев, с продажами ниже среднего
        int minSell = 0;
        int averageSum = getAverageMonthlySell(sell);

        for (int monthAmount : sell) {
            if (monthAmount < averageSum)
            minSell = minSell + 1;
        }
        return minSell;
    }

    public int getMonthHigherAverageSell(int[] sell) { //количество мес, где продажи были больше среднего
        int maxMonth = 0;
        double averageSum = getAverageMonthlySell(sell);

        for (int monthAmount : sell) {
            if (monthAmount > averageSum) {
                maxMonth = maxMonth + 1;
            }
        }
        return maxMonth;
    }

}










