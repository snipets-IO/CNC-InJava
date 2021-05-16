package io.snipets.cncwithjava.cohesion.functional;

public class Employee {

	public void create() {
		init();
		System.out.println("An employee has been created.");
	}

	private void init() {
		System.out.println("Employee detials initialised there.");
	}
}