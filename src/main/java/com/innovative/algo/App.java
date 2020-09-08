package com.innovative.algo;


import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        printArray(entry);
        printArray(entry);
    }

    private static void printArray(int[] entry) {
        IntStream.of(entry).forEach(System.out::print);
        System.out.println();
    }
}
