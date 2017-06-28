package ru.job4j.max;

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
public class MaxTest {
    /**
    * Test maximal value.
    */
	@Test
    public void whenFirstValueBiggerThanSecond() {
        Max maximum = new Max();
        maximum.max(first, second);
        int result = maximum.getResult();
        int expected = first;
        assertThat(result, is(expected));
	}
}