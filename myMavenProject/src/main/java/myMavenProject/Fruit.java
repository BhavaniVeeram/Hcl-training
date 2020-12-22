package myMavenProject;

public class Fruit {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Fruit() {}
	public Fruit(String aName) {
		setName(aName);
	}
	public String hello() {
		return "My Name is hello"+name;
	}
}
