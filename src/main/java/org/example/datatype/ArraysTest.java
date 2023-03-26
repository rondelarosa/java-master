package org.example.datatype;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    public static void process() {

    }

    /**
     *
     * @param numbers i.e: [5,6,7]
     * @return { [], [5], [6],[7], [5,6], [5,7],[6,7],[5,6,7]}
     */
    public static List<List<Integer>> recursion(int[] numbers, List<List<Integer>> result) {
        Arrays.stream(numbers).forEach(f -> {
            result.add(List.of(f));
        });

        return result;
    }
}
