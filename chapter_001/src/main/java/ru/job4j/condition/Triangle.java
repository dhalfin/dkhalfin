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
     * @param a - a.
	 * @param b - b.
	 * @param c - c.
	 * @return area.
	 */
	public double area(double a, double b, double c) {
        double a = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        double b = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
        double c = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
		boolean go = true;
		if (a + b <= c || a + c <= b || a + c <= b) {
            go = false;
        } else {
		double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
 }
}