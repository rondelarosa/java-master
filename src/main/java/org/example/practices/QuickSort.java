package org.example.practices;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class QuickSort {

    public static void process(String... args) {
        int[] actual = { 9, 5, 1, 0, 6, 2, 3, 4, 7, 8 };
        int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        quickSort(actual, 0, actual.length-1);
    }

    @Test
    public void givenNumbers_whenSort_thenReturnSorted() {
        int[] actual = { 9, 5, 1, 0, 6, 2, 3, 4, 7, 8 };
        System.out.println("input: " + Arrays.toString(actual));

        int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
        System.out.println("output: " + Arrays.toString(expected));
    }

    public static int partition(int[] numbers, int begin, int end) {
        int pivot = numbers[end];

        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (numbers[j] <= pivot) {
                i++;

                int swapTemp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = swapTemp;
            }
        }

        int swapTemp = numbers[i + 1];
        numbers[i + 1] = numbers[end];
        numbers[end] = swapTemp;

        return i + 1;
    }

    public static void quickSort(int[] numbers, int begin, int end) {
        if (begin < end) {
            int partitioner = partition(numbers, begin, end);

            // Recursively sort elements of the 2 sub-arrays
            quickSort(numbers, begin, partitioner - 1);
            quickSort(numbers, partitioner + 1, end);
        }

    }
}
