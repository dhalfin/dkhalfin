package ru.job4j.array;
/**
 * Reversed array.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version 0.1
 * @since 27.06.2017
 */
public class Turn {
	/**
	 * Method returns reversed array.
     * @param array - array.
	 * @return reversed array.
	 */
	public int[] back(int[] array) {
		if (array == null || array.length == 0) {
			return new int[0];
		}
		if (array.length == 1) {
			return array;
		}
		for (int i = 0; i < array.length / 2; i++) {
			 int temp = array[i];
			 array[i] = array[array.length - 1 - i];
			 array[array.length - 1 - i] = temp;
		}
		return array;
	}

}