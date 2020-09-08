package com.innovative.algo.structures.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayManipulatorTest {
    private ArrayManipulator arrayManipulator = new ArrayManipulator();


    @Test
    public void deepCopy() {
        arrayManipulator.deepCopy();
    }

    @Test
    public void shallowCopy() {
        arrayManipulator.shallowCopy();
    }
}