import static org.junit.Assert.*;
import org.junit.Test;
public class testSelectionSort {
    @Test
    public void test() {
        testPositives();
        testNegatives();
        testMixed();
        testDuplicates();
    }
    // 1) testPositives – testing a list of all positive integers
    public void testPositives() {
        int expected[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int nums[] = {4, 1, 6, 7, 5, 8, 9, 3, 2};
        SelectionSort sorter = new SelectionSort();
        nums = sorter.basicSelectionSort(nums);
        assertArrayEquals(expected, nums);
    }
    // 2) testNegatives – testing a list of all negative integers
    public void testNegatives() {
        int expected[] = {-9, -8, -7, -6, -5, -4, -3, -2, -1};
        int nums[] = {-4, -1, -6, -7, -5, -8, -9, -3, -2};
        SelectionSort sorter = new SelectionSort();
        nums = sorter.basicSelectionSort(nums);
        assertArrayEquals(expected, nums);
    }
    // 3) testMixed – testing a list containing positive, negative and zeros.
    public void testMixed() {

    }
    // 4) testDuplicates  –  testing  a  list  containing  one  or  more  duplicate 
    //                       number, for both positive and negative numbers
    public void testDuplicates() {
        
    }
}
