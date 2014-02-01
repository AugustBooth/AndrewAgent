package andrew.agent.webaccess.test;


	import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import andrew.agent.webaccess.api.Browser;
import andrew.agent.webaccess.api.WebPage;

	public class TestWebAccess {

		private final static Logger LOGGER = Logger.getLogger(TestWebAccess.class.getName()); 
		
	  private static Browser b;

	@BeforeClass
	  public static void testSetup() {
		  b = new Browser();
	  }

	  @AfterClass
	  public static void testCleanup() {
	    b.close();
	  }

	  @Test(expected = java.lang.RuntimeException.class)
	  public void testExceptionIsThrown() { 
		  WebPage page = b.getPage("someInvalidURL");
		  LOGGER.info("b.getPage(\"someInvalidURL\").getPageTitle() = " + page.getPageTitle() );
	  }

	  @Test
	  public void testGetPage() {
		  WebPage page = b.getPage("http://cnn.com");
		  LOGGER.info("b.getPage(\"http://cnn.com\").getPageTitle() = " + page.getPageTitle() );
		  assertTrue(0 < page.getPageSource().length());
	  }
	} 
