package andrew.agent.webaccess.api;

import andrew.agent.webaccess.FirefoxBrowserImpl;

public class BrowserFactory {

	public static final String FIREFOX = null;

	public enum BrowserType {
		FIREFOX, CHROME, IE
	}
	
	public static Browser getBrowser(BrowserType browserType) {
		if(BrowserType.FIREFOX.equals(browserType)) {
			return new FirefoxBrowserImpl();
		}
		else if ((BrowserType.CHROME.equals(browserType))) {
			throw new IllegalArgumentException("TODO: CHROME not yet supported.");
		}
		else if ((BrowserType.IE.equals(browserType))) {
			throw new IllegalArgumentException("TODO: IE not yet supported.");
		}
		else {
			throw new IllegalArgumentException("Unsupported browser type");
		}
	}

}
