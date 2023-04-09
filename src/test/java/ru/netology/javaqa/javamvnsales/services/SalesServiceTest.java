package ru.netology.javaqa.javamvnsales.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void shouldFindTotalSum() {
        SalesService service = new SalesService();
        int[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedSum = 180;
        int actualSum = service.getSum(monthSales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSum() {
        SalesService service = new SalesService();
        int[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedSum = 15;
        int actualSum = service.getAverageSum(monthSales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindMaxSale() {
        SalesService service = new SalesService();
        int[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.getMaxSale(monthSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSale() {
        SalesService service = new SalesService();
        int[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.getMinSale(monthSales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthNumbLowAverageSum() {
        SalesService service = new SalesService();
        int[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.getMonthNumbLowAverage(monthSales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMonthNumbUpperAverageSum() {
        SalesService service = new SalesService();
        int[] monthSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.getMonthNumbUpperAverage(monthSales);
        Assertions.assertEquals(expected, actual);

    }
}
