package org.example.practices.array;

import java.util.*;

public class TwoNumberSum {
    public static void process(String... args) {
        var result = twoNumberSumV2(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(result);
    }

    /**
     * Use a HashMap (Most efficient)
     * You can use a HashMap to solve the problem in O(n) time complexity. Here are the steps:
     *
     * Initialize an empty HashMap.
     * Iterate over the elements of the array.
     * For every element in the array -
     * If the element exists in the Map, then check if it’s complement (target - element) also exists in the Map or not. If the complement exists then return the indices of the current element and the complement.
     * Otherwise, put the element in the Map, and move to the next iteration.
     */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Map<Integer, Integer> previous = new HashMap<>();

        int length = array.length;

        for(int i=0; i < length; i++) {
            int targetValue = targetSum - array[i];
            if(previous.containsKey(targetValue)) {
                return new int[] { targetValue, array[i]}; // return the value and not the indexes
            } else {
                previous.put(array[i], i);
            }

        }
        return new int[] {};
    }

    /**
     * Time complexity: O(n)
     */
    public static int[] twoNumberSumV2(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> previous = new HashSet<>();

        for(int num: array) {
            int targetValue = targetSum - num;
            if(previous.contains(targetValue)) {
                return new int[] { targetValue, num}; // return the value and not the indexes
            } else {
                previous.add(num);
            }

        }
        return new int[0];
    }

    /**
     * Two pointer approach. It is a very common pattern for solving array related problems
     * Time complexity: O(n*log(n))
     */
    public static int[] twoPointerApproach(int[] array, int targetSum) {

        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) {
                return new int[]{array[left], array[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    /**
     * Naive approach
     * The naive approach is to just use two nested for loops and check if the sum of any two elements in the array is equal to the given target.
     * Worst
     * Time complexity: O(n^2)
     */
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    /**
     * Use Sorting along with the two-pointer approach
     * Time complexity: O(n*log(n))
     * https://www.callicoder.com/two-sum-problem/
     * There is another approach which works when you need to return the numbers instead of their indexes. Here is how it works:
     *
     * Sort the array.
     * Initialize two variables, one pointing to the beginning of the array (left) and another pointing to the end of the array (right).
     * Loop until left < right, and for each iteration
     * if arr[left] + arr[right] == target, then return the indices.
     * if arr[left] + arr[right] < target, increment the left index.
     * else, decrement the right index.
     * This approach is called the two-pointer approach. It is a very common pattern for solving array related problems.
     */
    private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}
