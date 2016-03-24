package AppliSimu;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testConversionMetresPixels() {
		
		Convertion monTriangle = new Convertion();
		
		int xPixels = monTriangle.conversionPositionPixel(110);
		
		assertEquals(55, xPixels);
	}

}
