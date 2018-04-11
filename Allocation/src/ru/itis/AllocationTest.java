package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AllocationTest {
    private Allocation allocation;


    @Before
    public void setUp() {
        allocation = new Allocation();
    }

    @Test
    public void test1() {
        int[] array1 = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
        int expected = 5;
        int actual = allocation.allocationTree(15, 3, array1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int[] array2 = {5, 5, 0, 5, 0, 5};
        int expected = 2;
        int actual = allocation.allocationTree(7, 2, array2);
        Assert.assertEquals(expected, actual);
    }


}
