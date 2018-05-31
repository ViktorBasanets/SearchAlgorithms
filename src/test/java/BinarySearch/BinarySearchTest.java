package BinarySearch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BinarySearchTest {

    private BinarySearch searchAgent;
    private int[] array1;
    private int[] array2;

    @Before
    public void init() {
        searchAgent = new BinarySearch();
        array1 = new int[] {1, 3, 5, 6, 8, 9, 11};
        array2 = new int[] {6, 7, 8, 9, 12, 1, 2, 3, 5};
    }

    @Test
    public void testRecursiveSearchMethodInSortedArrayWhenValueIsPresent() {
        int expectedResult = 6;
        int actualResult = searchAgent.recursiveSearch(11, array1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRecursiveSearchMethodInSortedArrayWhenValueIsNotPresent() {
        int expectedResult = -1;
        int actualResult = searchAgent.recursiveSearch(10, array1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRecursiveSearchMethodInSortedButShiftedArrayWhenValueIsPresent() {
        int expectedResult = 8;
        int actualResult = searchAgent.recursiveSearch(5, array2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRecursiveSearchMethodInSortedButShiftedArrayWhenValueIsNotPresent() {
        int expectedResult = -1;
        int actualResult = searchAgent.recursiveSearch(20, array2);
        assertEquals(expectedResult, actualResult);
    }


}
