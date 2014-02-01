package andrew.agent.webaccess.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import andrew.agent.webaccess.HelloImpl;

public class Browser {

	
	private FirefoxDriver driver;

	
	public Browser () {
		driver = new FirefoxDriver();
	}

	
	protected void doHello() {
		HelloImpl impl = new HelloImpl();
		impl.doHello();
	}

	
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

	
	public WebPage getPage(String url) throws IllegalArgumentException {
		loadPage(url);
		WebPage page = new WebPage(driver);
		return page;
	}

	
	public void close() {
		driver.quit();
	}

}
