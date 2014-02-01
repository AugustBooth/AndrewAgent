package andrew.agent.webaccess.api;

import org.openqa.selenium.firefox.FirefoxDriver;


public class WebPage {

	private String pageSource;
	private String pageTitle;

	public WebPage(FirefoxDriver driver) {
		pageSource = driver.getPageSource();
		pageTitle = driver.getTitle();
	}

	public String getPageSource() {
		return pageSource;
	}

	public String getPageTitle() {
		return pageTitle;
	}
}
