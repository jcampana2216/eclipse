package org.campana.eclipse;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.*;
import java.util.logging.*;



/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private static Logger logger = Logger.getLogger(AppTest.class.getName());
	
	@Test
	public void shouldTestTrue() {
		assertTrue(true);
		logger.log(Level.INFO, "Test succeeded!");
	}
}
    
