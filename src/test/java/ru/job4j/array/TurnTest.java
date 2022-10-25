package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray1() {
        int[] input = new int[] {4, 1, 6, 2, 40, 211, 0, 697};
        int[] result = Turn.back(input);
        int[] expected = new int[] {697, 0, 211, 40, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 8};
        int[] result = Turn.back(input);
        int[] expected = new int[] {8, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray1() {
        int[] input = new int[] {4, 1, 6, 2, 8, 30, 45, 4, 3};
        int[] result = Turn.back(input);
        int[] expected = new int[] {3, 4, 45, 30, 8, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

}