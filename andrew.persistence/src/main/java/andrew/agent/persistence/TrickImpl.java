package andrew.agent.persistence;

import andrew.agent.api.Trick;


public class TrickImpl implements Trick {

	@Override
	public String getName() {
		return name;
	}


	@Override
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String getDescription() {
		return description;
	}


	@Override
	public void setDescription(String description) {
		this.description = description;
	}


	private String name = null;
	private String description = null;
	
	public TrickImpl(String name, String description, String scriptName) {
		this.name = name;
		this.description = description;
	}

	
    public void doHello() {
        System.out.println("hello world!");
    }
       
}
