package andrew.agent.webaccess;

import org.openqa.selenium.remote.RemoteWebDriver;

import andrew.agent.webaccess.api.WebPage;


public class WebPageImpl implements WebPage {

	private String pageSource;
	private String pageTitle;

	public WebPageImpl(RemoteWebDriver remoteWebDriver) {
		pageSource = remoteWebDriver.getPageSource();
		pageTitle = remoteWebDriver.getTitle();
	}

	@Override
	public String getPageSource() {
		return pageSource;
	}

	@Override
	public String getPageTitle() {
		return pageTitle;
	}
}
