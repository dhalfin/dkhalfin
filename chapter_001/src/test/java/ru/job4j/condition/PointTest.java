package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Dinar Khalfin (mailto:dinarhalfin@yahoo.com)
* @version $Id$
* @since 0.1
*/
public class PointTest {
    /**
    * Test function.
    */
	@Test
	public void whenXthenYisAincreaseXplusB() {
		Point point = new Point();
		point.is(2D, 0D);
		int x = 2D;
		int result = point.getY();
		int expected = 4D;
		assertThat(result, is(expected));
	}
}