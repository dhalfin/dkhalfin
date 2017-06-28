package ru.job4j.condition;
/**
 * Point.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version $Id$
 * @since 27.06.2017
 */
public class Point {
	/**
     * x.
	 */
    private int x;
	/**
     * y.
	 */
    private int y;
    /**
	 * Point.
     * @param x - x.
	 * @param y - y.
	 */
     public  Point(int x, int y) {
       this.x = x;
       this.y = y;
  }
     /**
	 * Get the x.
	 * @return x.
	 */
     public int getX() {
       return this.x;
  }
	 /**
	 * Get the y.
	 * @return y.
	 */
     public int getY() {
       return this.y;
  }
     /**
	 * Check the point in function.
     * @param a - a.
	 * @param b - b.
	 * @return y
	 */
     public boolean is(int a, int b) {
       return y == a * x + b;
 }
}