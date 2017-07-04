package ru.job4j.condition;
/**
 * Triangle.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version $Id$
 * @since 27.06.2017
 */
public class Triangle {
	/**
     * a.
	 */
	private Point a;
	/**
     * b.
	 */
	private Point b;
	/**
     * c.
	 */
	private Point c;
	/**
	 * Triangle.
     * @param a - a.
	 * @param b - b.
	 * @param c - c.
	 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	* Distance from one point to another.
	* @param that - that.
	* @return distance.
	*/
	public double distance(Point that) {
		double sx = this.x - that.x;
		double sy = this.y - that.y;
		return Math.sqrt(sx * sx + sy * sy);
	}
	/**
	 * Check for area of triangle.
	 * @return area.
	 */
	public double area() {
		double result = -1;
		if (result == -1) {
			double ab = a.distance(b);
			double bc = b.distance(c);
			double ac = a.distance(c);

		/*if (ab + ac <= bc || ab + bc <= ac || bc + ac <= ab)*/

			double p = (ab + bc + ac) / 2.0;
			double result = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
		return result;
 }
}