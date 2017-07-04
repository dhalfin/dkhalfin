package ru.job4j.loop;
/**
 * Counter.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version $Id$
 * @since 25.06.2017
 */
public class Counter {
	/**
	 * Addition of even numbers.
     * @param start - start.
	 * @param finish - finish.
	 * @return summ.
	 */
	public int add(int start, int finish) {
		int sum = 0;
		for (int index = start; index != finish; index++) {
			if (index % 2 == 0) {
				sum += index;
			}
			return sum;
		}
	}

}