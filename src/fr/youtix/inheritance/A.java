package fr.youtix.inheritance;

public class A extends B {
	
	public String temp() {
		return "Class A ==> temp()";
	}
	
	public String displaySomething() {
		return this.getSomething();
	}

}
