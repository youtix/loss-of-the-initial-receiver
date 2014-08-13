package fr.youtix.composition;

public class B {
	
	public String temp() {
		return "Class B temp()";
	}
	
	public String getSomething() {
		//At this moment we loose the initial receiver.
		return this.temp();
	}

}
