import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		//RomanConversion R = new RomanConversion();
		
		
		for (int i = 5; i < 1000; i++) {
			assertEquals(RomanConversion.binaryToRoman(i), number.toRoman(i));
		}
	}
	

}
