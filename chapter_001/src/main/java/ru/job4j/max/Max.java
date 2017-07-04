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
	 * Maximum.
     * @param first - first.
	 * @param second - second.
	 * @param third - third.
	 * @return maximum number.
	 */
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}