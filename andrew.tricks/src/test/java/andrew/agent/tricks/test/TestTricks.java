package andrew.agent.tricks.test;


import java.util.Set;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import andrew.agent.api.Trick;
import andrew.agent.tricks.api.TricksFactory;


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

      
      @Test
	  public void testQueryTricks() {
		  Set<Trick> tricks = TricksFactory.getTricks();
	  }
      
      
      @Test
	  public void testAddAndRemoveTrick() {
		  Set<Trick> tricks = TricksFactory.getTricks();
	  }
      
      
	} 
