package ru.job4j.loop;
/**
 * Factorial.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version $Id$
 * @since 25.06.2017
 */
public class Factorial {
	/**
	 * Calculation of factorial.
     * @param n - n.
	 * @return result.
	 */
	public int calc(int n) {
		int result;
		for (int index = 1; index <= n; index++) {
			result *= index;
		}
		return result;
	}
}