package io.githib.ndimovt;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyBinarySearchTest {

    @Test
    void binarySearch() {
        int[] testArray = {23,54,789,6547,6,88,95,70,17,7,1958,3258,15478,2023};
        Arrays.sort(testArray);
        assertEquals(3, MyBinarySearch.binarySearch(23,testArray));
    }
}