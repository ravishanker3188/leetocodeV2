package org.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchinRotatedSortedArrayTest {

    @Test
    void search1() {
        int nums[] = new int[]{4, 5, 6, 7, 0, 1, 2}, target = 0;
        SearchinRotatedSortedArray searchinRotatedSortedArray = new SearchinRotatedSortedArray();
        int result = searchinRotatedSortedArray.search(nums, target);
        assertEquals(4, result);
    }

    @Test
    void search2() {
        int nums[] = new int[]{4, 5, 6, 7, 0, 1, 2}, target = 3;
        SearchinRotatedSortedArray searchinRotatedSortedArray = new SearchinRotatedSortedArray();
        int result = searchinRotatedSortedArray.search(nums, target);
        assertEquals(-1, result);
    }

    @Test
    void search3() {
        int nums[] = new int[]{4, 5, 6, 7, 0, 1, 2}, target = 5;
        SearchinRotatedSortedArray searchinRotatedSortedArray = new SearchinRotatedSortedArray();
        int result = searchinRotatedSortedArray.search(nums, target);
        assertEquals(1, result);
    }
    @Test
    void search4() {
        int nums[] = new int[]{1}, target = 0;
        SearchinRotatedSortedArray searchinRotatedSortedArray = new SearchinRotatedSortedArray();
        int result = searchinRotatedSortedArray.search(nums, target);
        assertEquals(-1, result);
    }
}