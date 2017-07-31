package ru.job4j.array;
/**
 * Bubble sort array.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version 0.1
 * @since 27.06.2017
 */
public class BubbleSort {
		/**
		* Method returns bubble sort array.
		* @param array - array.
		* @return sorted array.
		*/
		public int[] sort(int[] array) {
		if (array == null || array.length == 0) {
			return new int[0];
		}
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}