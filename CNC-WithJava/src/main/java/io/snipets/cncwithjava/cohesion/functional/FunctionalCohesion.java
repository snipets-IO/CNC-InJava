package io.snipets.cncwithjava.cohesion.functional;

import io.snipets.cncwithjava.cohesion.Cohesive;

/**
 * 
 * @author Sonu Sharma
 *
 */
public class FunctionalCohesion implements Cohesive {

	/**
	 * 
	 */
	@Override
	public void startCohesion() {
		Employee employee = new Employee();
		employee.create();
		Report report = new Report();
		report.generate();
		Mail mail = new Mail();
		mail.send();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FunctionalCohesion functionalCohesion = new FunctionalCohesion();
		functionalCohesion.startCohesion();
	}
}