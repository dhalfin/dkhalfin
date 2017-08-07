package ru.job4j.array;
/**
 * Rotated array.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version 0.1
 * @since 27.06.2017
 */
public class RotateArray {
	/** Rotates array by the hour hand.
     * creates new array, if the baseline array are not square
     * @param array two-dimensional array
     * @return rotated array by the hour hand
     */
	public int[][] rotate(int[][] array) {
		int rows = array.length;
		int columns = array[0].length;
		int[][] returnArray;
		if (rows == columns) {
			returnArray = rotateSquareArray(array);
		} else {
			returnArray = new int[columns][rows];
			for (int i = 0; i < columns; i++) {
				for (int k = 0; k < rows; k++) {
					returnArray[i][k] = array[rows - 1 - k][i];
				}
			}
		}
		return returnArray;
	}
	/** Rotates square array.
     * @param array - baseline array
     * @return rotated array
     */
	 private int[][] rotateSquareArray(int[][] array) {
		 int mxIn = array.length - 1;
		 for (int i = 0; i < array.length / 2 + array.length % 2; i++) {
			 for (int p = 0; p < array.length / 2; p++) {
				 int temp = array[i][p];
				 array[mxIn - p][i] = array[mxIn - i][mxIn - p];
				 array[mxIn - i][mxIn - p] = array[p][mxIn - i];
				 array[p][mxIn - i] = tmp;
			 }
		 }
		 return array;
	 }
}