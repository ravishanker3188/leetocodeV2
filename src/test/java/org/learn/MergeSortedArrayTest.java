package org.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge1() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;

        int[] result = new int[]{1,2,2,3,5,6};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1,m,nums2,n);
        assertArrayEquals(nums1,result,"Assert Array Expected 1,2,2,3,5,6");
    }
    @Test
    void merge2() {
        int[] nums1 = new int[]{1};
        int m = 1;
        int[] nums2 = new int[]{};
        int n = 0;

        int[] result = new int[]{1};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1,m,nums2,n);
        assertArrayEquals(nums1,result,"Assert Array Expected 1");
    }
    @Test
    void merge3() {
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;

        int[] result = new int[]{1};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1,m,nums2,n);
        assertArrayEquals(nums1,result,"Assert Array Expected 1");
    }
}