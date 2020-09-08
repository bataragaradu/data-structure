package com.innovative.algo.structures.arrays.sorting;

import com.innovative.algo.domain.SortingOrder;
import com.innovative.algo.sorting.logarithmic.MergeSort;

/**
 * Given an array Arr[] of N distinct integers, print the array in such a way that the first element is first maximum and second element is first minimum and so on.
 */
public class AlternativeSorting {

    public static int[] sort(int[] array) {
        int[] sortedArray = findGoodSortingAlgorithm(array);
        int[] result = new int[sortedArray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            if (i % 2 == 0) {
                result[i] = sortedArray[sortedArray.length - i / 2 - 1];
            } else {
                result[i] = sortedArray[i / 2];
            }
        }
        return result;
    }

    private static int[] findGoodSortingAlgorithm(int[] array) {
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sort(array, SortingOrder.ASC);
        return result;
    }
}
