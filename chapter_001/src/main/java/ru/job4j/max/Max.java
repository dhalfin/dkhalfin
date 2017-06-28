package ru.job4j.max;
/**
 * Maximum from two numbers.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version $Id$
 * @since 27.06.2017
 */
public class Max {
	/**
     * Result.
     */
    private int result;
	/**
	 * Maximum.
     * @param first - first.
	 * @param second - second.
	 * @return result.
	 */
    public int max(int first, int second) {

        result = (first > second) ? first : second;
        return result;
    }
	/**
	 * Get the result.
	 * @return result.
	 */
	public int getResult() {
        return this.result;
    }
}