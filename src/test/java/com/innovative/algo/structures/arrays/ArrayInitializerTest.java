package com.innovative.algo.structures.arrays;

import com.innovative.algo.domain.Address;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayInitializerTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void initializeObjects() {
        Address[] array = ArrayInitializer.initializeObjects();
        array[50] = new Address();
    }

    @Test
    public void initializeObjectsByLength() {
    }
}