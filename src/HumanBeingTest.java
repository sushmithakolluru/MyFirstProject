import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HumanBeingTest {

	@Test
	public void testGetName() {
		
		HumanBeing MinnieMyLadyLuck = new HumanBeing();
		MinnieMyLadyLuck.name = "Dhanvi"; 
		Assert.assertEquals("Dhanvi", MinnieMyLadyLuck.getName());
		
	}

}
