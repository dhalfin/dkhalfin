package ru.job4j.array;

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
public class TurnTest {
	/**
    * Test array with 5 numbers.
    */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
         Turn turn = new Turn();
		 assertThat(turn.back(new int[]{1, 2, 3, 4, 5}), is(new int[]{5, 4, 3, 2, 1}));
    }
	/**
    *  Test array with 4 numbers.
    */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		assertThat(turn.back(new int[]{2, 4, 1, 6}), is(new int[]{6, 1, 4, 2}));
	}
}