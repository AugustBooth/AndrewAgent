package andrew.agent.webaccess.api;

public interface Browser {

	void loadPage(String url) throws IllegalArgumentException;

	WebPage getPage(String url) throws IllegalArgumentException;

	PageElement getElementByName(String name);

	void close();

}
