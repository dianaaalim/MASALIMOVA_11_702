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

    @Test
    public void test3() {
        int[] array3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int expected = 2;
        int actual = allocation.allocationTree(12, 2, array3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        int[] array4 = {0 ,0 ,0 ,1 ,1 ,2 ,6 ,6 ,6 ,3 ,10 ,10 ,10 ,10 ,3 ,5 ,5 ,5 ,5 ,5};
        int expected = 4;
        int actual = allocation.allocationTree(21, 3, array4);
        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test5() {
        int[] array5 = {5, 6, 7, 8};
        allocation.allocationTree(0, 4, array5);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test6() {
        int[] array6 = {3, 2, 1};
        allocation.allocationTree(4, -1, array6);
    }






}
