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
public class FactorialTest {
	/**
    * Test of factorial function of 5.
    */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
		assertThat(factorial.calc(5), is(120));
    }
	/**
    * Test of amout function of zero.
    */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
		assertThat(factorial.calc(0), is(1));
    }
}