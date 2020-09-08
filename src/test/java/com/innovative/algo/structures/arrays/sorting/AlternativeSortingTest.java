package com.innovative.algo.structures.arrays.sorting;

import com.innovative.algo.structures.arrays.FileReader;
import org.junit.Test;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AlternativeSortingTest {

    @Test
    public void sortTestCases() throws IOException {
        FileReader fileReader = new FileReader();
        String content = fileReader.getFileContent("src/test/resources/alternative-sorting.txt");
        String[] lines = content.split("\r\n");
        String numberOfTestCases = lines[0];
        for (int i = 1; i <= Integer.parseInt(numberOfTestCases) *2;
        i = i = i + 2){
            Integer elementsNumber = Integer.valueOf(lines[i]);
            String[] elements = lines[i + 1].split(" ");
//            Integer[] intElements = Arrays.stream(elements).map(Integer::parseInt).toArray(Integer[]::new);
            int[] intElements = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();
            sort(intElements);
        }
    }

    private void sort(int[] intElements) {
        int[] result = AlternativeSorting.sort(intElements);
        printArray(result);
    }

    private static void printArray(int[] entry) {
        IntStream.of(entry).forEach((ent) -> System.out.print(ent + " "));
        System.out.println();
    }
}