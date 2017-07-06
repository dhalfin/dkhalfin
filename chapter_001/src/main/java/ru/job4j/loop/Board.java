package ru.job4j.loop;
/**
 * Chess.
 *
 * @author Dinar Khalfin (dinarhalfin@yahoo.com)
 * @version 0.1
 * @since 25.06.2017
 */
public class Board {
   /**
	* @param width - width.
	* @param height - height.
	* @return blank.
	*/
	public String paint(int width, int height) {
		StringBuilder blank = new StringBuilder();
	for (int x = 0; x < height; x++) {
			for (int y = 0; y < width; y++) {
				blank.append((x + y) % 2 == 0 ? "X" : " ");
			}
			blank.append(System.lineSeparator());
		}
		return blank.toString();
	}
}