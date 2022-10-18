package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To4Then6() {
        int left = 6;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax23To41Then41() {
        int left = 23;
        int right = 41;
        int result = Max.max(left, right);
        int expected = 41;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax72To72Then72() {
        int left = 72;
        int right = 72;
        int result = Max.max(left, right);
        int expected = 72;
        assertThat(result).isEqualTo(expected);
    }
}