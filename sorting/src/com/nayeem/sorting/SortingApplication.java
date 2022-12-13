package com.nayeem.sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortingApplication {

    static Sort<Integer> BUBBLE_SORT = (list) -> {
        System.out.println("START: BUBBLE SORT");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    // Swap the list
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        System.out.println("END: BUBBLE SORT");
        return list;
    };
    static Sort<String> SELECTION_SORT = (list) -> {
        System.out.println("START: SELECTION SORT");
        for (int i = 0; i < list.length; i++) {
            // Find the index of the smallest remaining element
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the smallest remaining element with the first element of the unsorted part of the list
            String temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
        System.out.println("END: SELECTION SORT");
        return list;
    };

    static Sort<Double> INSERTION_SORT = (list) -> {
        System.out.println("START: INSERTION SORT");
        for (int i = 1; i < list.length; i++) {
            // Get the current element and its value
            double currentValue = list[i];
            int j = i;

            // Shift all the larger elements to the right until the correct position for the current element is found
            while (j > 0 && list[j - 1] > currentValue) {
                list[j] = list[j - 1];
                j--;
            }

            // Insert the current element into its correct position
            list[j] = currentValue;
        }
        System.out.println("END: INSERTION SORT");
        return list;
    };

    static Sort<Integer> MERGE_SORT = (list) -> {
        // Call the helper method to sort the array
        mergeSort(list, 0, list.length - 1);
        return list;
    };

    static Sort<Integer> QUICK_SORT = (list) -> {
        // Call the helper method to sort the array
        quickSort(list, 0, list.length - 1);
        return list;
    };

    // Helper method to perform the recursive sorting
    static void quickSort(Integer[] numbers, int start, int end) {
        // If the list contains more than one element, partition it around the pivot
        if (start < end) {
            int pivotIndex = partition(numbers, start, end);
            quickSort(numbers, start, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, end);
        }
    }

    // Helper method to perform the recursive sorting
    static void mergeSort(Integer[] numbers, int start, int end) {
        // If the list contains more than one element, divide it in half
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(numbers, start, middle);
            mergeSort(numbers, middle + 1, end);

            // Merge the two sorted sublists
            Integer[] left = Arrays.copyOfRange(numbers, start, middle + 1);
            Integer[] right = Arrays.copyOfRange(numbers, middle + 1, end + 1);

            int i = 0, j = 0, k = start;
            while (i < left.length && j < right.length) {
                if (left[i] > right[j]) {
                    numbers[k] = left[i];
                    i++;
                } else {
                    numbers[k] = right[j];
                    j++;
                }
                k++;
            }

            // Copy the remaining elements of the left sublist, if any
            while (i < left.length) {
                numbers[k] = left[i];
                i++;
                k++;
            }

            // Copy the remaining elements of the right sublist, if any
            while (j < right.length) {
                numbers[k] = right[j];
                j++;
                k++;
            }
        }
    }

    static // Helper method to partition the list around the pivot
    int partition(Integer[] numbers, int start, int end) {
        int pivot = numbers[end];
        int i = start;

        for (int j = start; j < end; j++) {
            if (numbers[j] <= pivot) {
                // Swap the numbers
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
            }
        }

        // Swap the pivot into its correct position
        int temp = numbers[i];
        numbers[i] = numbers[end];
        numbers[end] = temp;

        return i;
    }

    public static void main(String[] args) {
        final Integer[] bs_input = new Integer[]{10, 5, 1, 6, 4};
        BUBBLE_SORT.print(bs_input, false);
        BUBBLE_SORT.print(BUBBLE_SORT.doSort(bs_input.clone()), true);
        final String[] ss_input = {"carrot", "apple", "banana", "eggplant", "date",};
        SELECTION_SORT.print(ss_input, false);
        SELECTION_SORT.print(SELECTION_SORT.doSort(ss_input), true);
        Double[] is_input = {3.14, 1.61, 2.72, 4.67, 1.23};
        INSERTION_SORT.print(is_input, false);
        INSERTION_SORT.print(INSERTION_SORT.doSort(is_input), true);
        Integer[] ms_input = {8, 3, 5, 4, 1, 9, 6, 2, 7};
        MERGE_SORT.print(ms_input, false);
        MERGE_SORT.print(MERGE_SORT.doSort(ms_input), true);
        Integer[] qs_input = {8, 3, 5, 4, 1, 9, 6, 2, 7};
        QUICK_SORT.print(qs_input, false);
        QUICK_SORT.doSort(qs_input);
        QUICK_SORT.print(qs_input, true);
//        Stream
//        String
//        StringBuilder
    }
}
