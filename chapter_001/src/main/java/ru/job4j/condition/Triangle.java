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
	 * Check for area of triangle.
	 * @return area.
	 */

	public double area() {
        double ab = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        double ac = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
        double bc = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
		boolean go = true;
		if (ab + ac <= bc || ab + ac <= bc || ab + ac <= bc) {
            go = false;
        } else {
		double p = (ab + bc + ac) / 2.0;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
	}


 }
}