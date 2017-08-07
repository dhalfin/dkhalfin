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
public class ArrayDuplicateTest {
	/**
	* Test.
	*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
		String[] array = {"identical", "identical", "identical", "identical", "identical"};
		String[] expect = {"identical"};
		assertThat(arrayDuplicate.remove(array), is(expect));
    }
	/**
	* Test.
	*/
	@Test
	public void whenArrayIdenticalThenUnique() {
		ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
		String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] expect = {"Привет", "Мир", "Супер"};
		assertThat(arrayDuplicate.remove(array), is(expect));
	}
}