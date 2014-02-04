package andrew.agent.webaccess.api;

import andrew.agent.webaccess.api.WebPage;

public interface Browser {

	void loadPage(String url) throws IllegalArgumentException;

	WebPage getPage(String url) throws IllegalArgumentException;

	PageElement getElementByName(String name);

	void close();

}
