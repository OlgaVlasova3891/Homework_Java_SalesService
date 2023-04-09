package ru.netology.javaqa.javamvnsales.services;

public class SalesService {
    public int getSum(int[] monthSales) {
        int sum = 0; //переменная, в которой будем хранить сумму
        for (int i = 0; i < monthSales.length; i++) {
            sum += monthSales[i];
        }
        return sum;
    }

    int getAverageSum(int[] monthSales) {

        int average; // переменная в которой будет храниться средняя сумма
        int sum = getSum(monthSales); //переменная, в которой будем хранить сумму

        average = sum / monthSales.length;

        return average;
    }

    int getMaxSale(int[] monthSales) {
        int maxSale = 0; //переменная в которой будет храниться максимальная продажа
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] >= monthSales[maxSale]) {
                maxSale = i;
            }
        }
        return maxSale + 1;
    }

    int getMinSale(int[] monthSales) {
        int minSale = 0; //переменная в которой будет храниться максимальная продажа
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] <= monthSales[minSale]) {
                minSale = i;
            }
        }
        return minSale + 1;
    }

    int getMonthNumbLowAverage(int[] monthSales) {
        int averageSum = getAverageSum(monthSales);
        int count = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] < averageSum) {
                count++;
            }
        }
        return count;
    }

    int getMonthNumbUpperAverage(int[] monthSales) {
        int averageSum = getAverageSum(monthSales);
        int count = 0;
        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] > averageSum) {
                count++;
            }
        }
        return count;
    }
}
