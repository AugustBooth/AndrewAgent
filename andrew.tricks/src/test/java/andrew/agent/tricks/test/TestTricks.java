package andrew.agent.tricks.test;


import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


	public class TestTricks {

		private final static Logger LOGGER = Logger.getLogger(TestTricks.class.getName()); 
		
	  //private static Browser b;

	@BeforeClass
	  public static void testSetup() {
		  //b = BrowserFactory.getBrowser(BrowserFactory.BrowserType.FIREFOX);
	  }

	  @AfterClass
	  public static void testCleanup() {
	    //b.close();
	  }

	} 
