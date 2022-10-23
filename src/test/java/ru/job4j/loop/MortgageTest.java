package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MortgageTest {
    @Test
    public void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAmount100Salary120Percent50ThenYear2() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 20;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAmount500000Salary200000Percent25ThenYear1() {
        int amount = 500000;
        int salary = 200000;
        double percent = 25;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}