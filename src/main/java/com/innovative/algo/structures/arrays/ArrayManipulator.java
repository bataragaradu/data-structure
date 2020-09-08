package com.innovative.algo.structures.arrays;

import com.innovative.algo.domain.Address;

/**
 * Arrays are a collection of items stored in a allocated memory. The items can be accessed via
 * the index of the array, because the items are stored in a continuous way in the memory.
 * They are dynamically allocated.
 * They are considered classes in java.
 * Arrays uses the Cloneable and Serializable for the array type manipulation.
 */

public class ArrayManipulator {

    public ArrayManipulator(){
    }

    /**
     * Deep copy
     * This creates a new array in memory so there will be 2 existing arrays that will point to 2 different memory zone.
     * @return teh newly created array
     */
    public Address[] deepCopy(){
        Address[] address = ArrayInitializer.initializeObjects();
        Address[] deepCopyAddress = address.clone();
        System.out.println("different memory for both arrays " + (address==deepCopyAddress));
        return deepCopyAddress;
    }


    /**
     * Deep copy
     * This creates a new array in memory so there will be 2 existing arrays that will point to 2 different memory zone.
     * @return teh newly created array
     */
    public Address[] shallowCopy(){
        Address[] address = ArrayInitializer.initializeObjects();
        Address[] deepCopyAddress =address;
        System.out.println("the same memory for both arrays " + (address == deepCopyAddress));

        Address[][] addressMultiDimensional = new Address[5][5];
        addressMultiDimensional[0] = ArrayInitializer.initializeObjects();
        addressMultiDimensional[1] = ArrayInitializer.initializeObjects();
        Address[][] deepCopyMultiple = addressMultiDimensional.clone();
        System.out.println("Different memory  for both arrays " + (addressMultiDimensional != deepCopyMultiple));
        System.out.println("the same memory for both sub arrays " + (address[0] == deepCopyAddress[0]));
        System.out.println("the same memory for both sub arrays " + (address[1] == deepCopyAddress[1]));
        return deepCopyAddress;
    }
}
