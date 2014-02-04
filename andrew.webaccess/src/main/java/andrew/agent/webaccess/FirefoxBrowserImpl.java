package andrew.agent.webaccess;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import andrew.agent.webaccess.api.Browser;
import andrew.agent.webaccess.api.PageElement;
import andrew.agent.webaccess.api.WebPage;

public class FirefoxBrowserImpl extends BrowserImpl implements Browser {

	
	private FirefoxDriver driver;

	
	public FirefoxBrowserImpl () {
		driver = new FirefoxDriver();
	}

	
	@Override
	public void loadPage(String url) throws IllegalArgumentException {
		HttpURLConnection.setFollowRedirects(true);
		HttpURLConnection con;
		try {
			con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			if (con.getResponseCode() >= 400) {
				// cannot access
				throw new RuntimeException("URL '" + url + "' resulted in a bad HTTP status code. (" + con.getResponseCode() + ")");
			}
		}
		catch (Exception e) {
			RuntimeException e2 =  new RuntimeException(e);
			throw e2;
		}
		driver.get(url);
	}

	@Override
	public WebPage getPage(String url) throws IllegalArgumentException {
		loadPage(url);
		WebPage page = new WebPageImpl(driver);
		return page;
	}

	@Override
	public PageElement getElementByName(String name) {
		List<WebElement> elements = driver.findElements(By.name(name));
		if(elements.size() != 1) {
			throw new IllegalArgumentException("Did not find exactly one element result. (found " + 
		                                        elements.size() + " results.)");
		}
		return new PageElementImpl(elements.get(0), this);
	}
	
	@Override
	public void close() {
		driver.quit();
	}


	public FirefoxDriver getDriver() {
		return driver;
		
	}



}
