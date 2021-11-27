package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {
	

	@Test
	public void istErstesHalbjahrTest() {
		assertTrue("Sie haben nicht ein gut monat geeingabe", Util.istErstesHalbjahr(1));
		assertTrue("Sie haben nicht ein gut monat geeingabe", Util.istErstesHalbjahr(6));
		try {
			assertTrue("Sie haben nicht ein gut monat geeingabe", Util.istErstesHalbjahr(0));
			assertTrue("Sie haben nicht ein gut monat geeingabe", Util.istErstesHalbjahr(7));
		}
		catch(Exception e) {
			
		}
		
	}

}
