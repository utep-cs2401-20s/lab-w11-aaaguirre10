import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class newSortingTest {
    //The following test case is basically for the method's general functionality
    //Test case : PASSED
    @Test
    public void newSortingTest() {
        newSorting sort = new newSorting();
        int[] arr = {3, 2, 6, 5, 1, 7, 4};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        sort.newSorting(arr, 4);
        assertArrayEquals(arr, expected);
    }
    //The following test case checks for duplicates
    //Test case : PASSED
    @Test
    public void newSortingTest2() {
        newSorting sort = new newSorting();
        int[] arr = {0, 5, 1, 8, 0, 0};
        int[] expected = {0, 0, 0, 1, 5, 8};
        sort.newSorting(arr, 4);
        assertArrayEquals(arr, expected);
    }
    //The following test case checks if the array can be sorted reversely
    //Test case : PASSED
    @Test
    public void newSortingTest3() {
        newSorting sort = new newSorting();
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort.newSorting(arr, 5);
        assertArrayEquals(arr, expected);

    }
    //The following test case checks if the array can be sorted with negative numbers and duplicates numbers.
    //Test case : PASSED
    @Test
    public void newSortingTest4() {
        newSorting sort = new newSorting();
        int[] arr = {-1, 0, 1, 0, 1, 0, -1};
        int[] expected = {-1, -1, 0, 0, 0, 1, 1};
        sort.newSorting(arr, 3);
        assertArrayEquals(arr, expected);

    }
    //The following test case checks if the half size is smaller than expected
    //Test case : PASSED
    @Test
    public void newSortingTest5() {
        newSorting sort = new newSorting();
        int[] arr = {10, 100, 20, 90, 30, 80, 40, 70, 50, 60};
        int[] expected = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        sort.newSorting(arr, 2);
        assertArrayEquals(arr, expected);
    }
}
