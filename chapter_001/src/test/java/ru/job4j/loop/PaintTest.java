package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Dinar Khalfin (mailto:dinarhalfin@yahoo.com)
* @version 0.1
* @since 25.06.2017
*/
public class PaintTest {
	/**
    * Test of pyramid with height of 2.
    */
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
	/**
    * Test Test of pyramid with height of 3.
    */
	@Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
		Paint paint = new Paint();
		String result = paint.piramid(3);
		String expected = String.format("  ^  %s ^^^ %s^^^^^%s", System.getProperty("line.separator"));
		assertThat(result, is(expected));
	}
}