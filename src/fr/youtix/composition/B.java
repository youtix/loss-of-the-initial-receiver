package fr.youtix.composition;

public class B {
	
	public String temp() {
		return "Class B temp()";
	}
	
	public String getSomething() {
		return this.temp();
	}

}
