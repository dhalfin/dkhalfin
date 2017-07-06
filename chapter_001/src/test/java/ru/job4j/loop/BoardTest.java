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
public class BoardTest {
	/**
    * Test of board with height of 3.
    */
	@Test
	public void whenPaintBoardWithWidthThreeAndHeigthThreeThenStringWithThreeColsAndThreeRows() {
		Board board = new Board();
		String result = board.paint(3, 3);
		final String line = System.getProperty("line.separator");
		String expected = String.format("X X%s X %sX X%s", line, line, line);
		assertThat(result, is(expected));
	}
	/**
    * Test of board with height of 4.
    */
	@Test
	public void whenPaintBoardWithWidthFiveAndHeigthFourThenStringWithFiveColsAndFourRows() {
		Board board = new Board();
		String result = board.paint(5, 4);
		final String line = System.getProperty("line.separator");
		String expected = String.format("X X X%s X X %sX X X%s X X %s", line, line, line, line);
	}
}