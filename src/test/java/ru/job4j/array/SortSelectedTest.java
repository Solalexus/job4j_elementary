package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {12, 7, 19};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 12, 19};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {40, 5, 64, 0, 18};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 5, 18, 40, 64};
        assertThat(result).containsExactly(expected);
    }
}