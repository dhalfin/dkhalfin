package ru.job4j.array;

import java.util.Arrays;

/**
 * Duplicated array.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version 0.1
 * @since 27.06.2017
 */
public class ArrayDuplicate {
	 /**
     * @param array - baseline array
     * @return array without duplication
     */
	public String[] remove(String[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			String element = array[i];
			for (int size = i + 1; size < length; size++) {
				if (element.equals(array[size])) {
					array[size] = array[length - 1];
					length--;
					size--;
				}
			}
		}
		return Arrays.copyOf(array, length);
	}

}