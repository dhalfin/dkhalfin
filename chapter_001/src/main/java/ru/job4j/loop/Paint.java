package ru.job4j.loop;
/**
 * Pyramid.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version $Id$
 * @since 25.06.2017
 */

public class Paint {
    /**
	 * Calculation of pyramid.
     * @param h - h.
	 * @return result.
	 */
	public String piramid(int h) {

	 StringBuilder result = new StringBuilder();

	 if (h != 0) {
		for (int rank = 1; rank <= h; rank++) {

			for (int gap = 0; gap < h - rank; gap++) {
				result.append(" ");
			}
			for (int gap = 1; gap <= h; gap++) {
				if (gap > (h - rank) && (gap < (h + rank))) {
					result.append("^ ");
				}
			}
			result.append(System.lineSeparator());
		}
	}
	return result.toString();
	}
}