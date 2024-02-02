package com.example.unittesting.unittesting.spike;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {
    @Test
    public void learning() {
        List<Integer> numbers = Arrays.asList(12, 15, 45);

        assertThat(numbers).hasSize(3)
                .contains(12, 15)
                .allMatch(x -> x > 10)
                .allMatch(x -> x < 100)
                .noneMatch(x -> x < 0);

        assertThat("").isEmpty();
        assertThat("ABCDE").contains("BCD")
                .startsWith("ABC")
                .endsWith("CDE");

    }

}
