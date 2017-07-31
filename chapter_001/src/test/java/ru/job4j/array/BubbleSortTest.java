package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Dinar Khalfin (mailto:dinarhalfin@yahoo.com)
* @version 0.1
* @since 25.06.2017
*/
public class BubbleSortTest {
	/**
    * Test for bubble sort array with 10 numbers.
    */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort bubblesort = new BubbleSort();
		resultArray = bubblesort.sort(new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
		expectedArray = bubblesort.sort(new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8});
        assertThat(resultArray, is(expectedArray));
    }
}