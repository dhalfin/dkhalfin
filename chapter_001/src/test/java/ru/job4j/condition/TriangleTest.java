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
public class TriangleTest {
    /**
    * Test function.
    */
	@Test
	public void whenAreaSetThreePointsThenTriangleArea() {
		Point a = new Point(0, 0);
		Point a = new Point(0, 2);
		Point a = new Point(2, 0);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = 2D;
		assertThat(result, closeTo(expected, 0.1));
	}

}