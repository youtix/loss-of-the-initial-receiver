package fr.youtix.composition;

public class A {
	
	public String temp() {
		return "Class A ==> temp()";
	}
	
	public String displaySomething() {
		return new B().getSomething();
	}

}
