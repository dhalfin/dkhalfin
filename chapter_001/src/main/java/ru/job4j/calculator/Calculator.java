/**
* Classe used to produce calculator.
*
* @since 1.0
* @author Dinar Khalfin
* @version 1.0
*/
package ru.job4j.calculator;
/**
 * Calculator.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version $Id$
 * @since 27.06.2017
 */
public class Calculator {
    /**
     * Result.
     */
	 private double result;
    /**
	 * Summ.
     * @param first - first.
	 * @param second - second.
	 */
	 public void add(double first, double second) {
		this.result = first + second;
	 }
    /**
	 * Substruct.
	 * @param first - first.
	 * @param second - second.
	 */
     public void substruct(double first, double second) {
		this.result = first - second;
	 }
     /**
	 * Division.
	 * @param first - first.
	 * @param second - second.
	 */
	 public void div(double first, double second) {
		this.result = first / second;
 	 }
    /**
     * Multiplication.
 	 * @param first - first.
	 * @param second - second.
	 */
	 public void multiple(double first, double second) {
		this.result = first * second;
	 }
    /**
	 * Get the result.
	 * @return result.
	 */
	 public double getResult() {
		return this.result;
	 }

}