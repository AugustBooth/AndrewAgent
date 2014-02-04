package andrew.agent.webaccess;

import org.openqa.selenium.WebElement;

import andrew.agent.webaccess.api.PageElement;
import andrew.agent.webaccess.api.WebPage;

public class PageElementImpl implements PageElement {

	private WebElement element;
	private BrowserImpl browser;

	public PageElementImpl(WebElement webElement, BrowserImpl webBrowser) {
		element = webElement;
		browser = webBrowser;
	}

	@Override
	public void sendKeys(String string) {
		element.sendKeys(string);
	}

	@Override
	public WebPage submit() {
		element.submit();
		return new WebPageImpl(browser.getDriver());
	}

}
