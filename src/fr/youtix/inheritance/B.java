package fr.youtix.inheritance;

public class B {
	
	public String temp() {
		return "Class B temp()";
	}
	
	public String getSomething() {
		//Here, "this" keep the initial receiver.
		return this.temp();
	}

}
