package com.innovative.algo.structures.arrays;

import com.innovative.algo.domain.Address;

public class ArrayInitializer {

    public static int[] initializeIntPrimitive() {
        int[] array = new int[10];
        int[] array3 = new int[]{1, 2, 3, 4, 5};
        return array3;
    }

    public static Address[] initializeObjects() {
        Address[] addressesArray2 = new Address[]{new Address(), new Address()};
        return addressesArray2;
    }

    public static Address[] initializeObjectsByLength(int length) {
        Address[] addressesArray = new Address[length];
        return addressesArray;
    }
}
