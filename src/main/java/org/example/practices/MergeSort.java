package org.example.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void process() {
        int[] list = new int[]{6, 3, 5, 1, 9, 45, 23};
        int[] result = mergeSort(list);
        System.out.println("input: " + Arrays.toString(list));
        System.out.println("output: " + Arrays.toString(result));
    }

    public static int[] mergeSort(int[] numbers) {
        if (numbers.length <= 1)
            return numbers;

        int mid = numbers.length / 2;

        int[] leftHalf = Arrays.copyOfRange(numbers, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(numbers, mid, numbers.length);

        int[] left = mergeSort(leftHalf);
        int[] right = mergeSort(rightHalf);
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        List<Integer> l = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                l.add(left[i]);
                i += 1;
            } else {
                l.add(right[j]);
                j += 1;
            }
        }

        while (i < left.length) {
            l.add(left[i]);
            i += 1;
        }

        while (j < right.length) {
            l.add(right[j]);
            j += 1;
        }

        return l.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

