package org.example.practices;

import java.util.Arrays;

public class BinarySearch {

    public static void process(String... args) {
        var output = searchPositionTarget(new int[]{-2, 3, 4, 7, 8, 9, 11, 13}, 11);
        System.out.println(output);

        var output2 = searchPositionTarget(new int[]{-2, 3, 4, 7, 8, 9, 11, 13}, 14);
        System.out.println(output2);

        String[] givenString = new String[]{"aa", "bb", "ee", "cC"};
        Arrays.sort(givenString);
        var output3 = searchString(givenString, "cc");
        System.out.println("CC index ? " + output3);

        String[] array = {"EWRSFSFSFSB", "BB", "AA", "SDFSFJ", "WRTG", "FF", "ERF", "FED", "TGH"};
        String search = "BB";
        Arrays.sort(array);
        int searchIndex = binarySearch(array, search);
        System.out.println(searchIndex != -1 ? array[searchIndex] + " - Index is " + searchIndex : "Not found");

        var recurResult = recursive(new int[]{1,2,3,4,5}, 5);
        System.out.println("recurResult :" + recurResult);
    }

    /**
     * Using binary search, shifted approach
     * e.g: arr = [-2, 3,4 ,7, 8, 9, 11, 13]
     * Time complexity = O(log n)
     */
    public static int searchPositionTarget(int[] numbers, int target) {
        Arrays.sort(numbers);

        int left = 0;
        int right = numbers.length - 1;

        while(left <= right) {
            int mid = (left  + right) / 2;

            if(numbers[mid] == target)
                return mid;
            else if(target < numbers[mid])
                right = mid - 1;
            else
                left = mid + 1;

        }

        return -1;
    }

    public static int searchString(String[] data, String value) {
        int left = 0;
        int right = data.length - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;

            if(data[mid].compareToIgnoreCase(value) < 0)
                left = mid + 1;
            else if(data[mid].compareToIgnoreCase(value) > 0)
                right = mid - 1;
            else
                return mid;
        }

        return -1;
    }

    public static int binarySearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else if (a[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static boolean recursive(int[] numbers, int target) {
        if(numbers.length == 0)
            return false;
        else {
            int midpoint = numbers.length / 2;

            if(numbers[midpoint] == target)
                return true;
            else {
                if(numbers[midpoint] < target)
                    return recursive(Arrays.copyOfRange(numbers,midpoint + 1, numbers.length), target);
                else
                    return recursive(Arrays.copyOfRange(numbers,0, midpoint - 1), target);
            }
        }
    }
}
