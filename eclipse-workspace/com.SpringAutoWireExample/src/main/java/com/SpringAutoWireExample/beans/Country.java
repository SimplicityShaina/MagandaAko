package com.SpringAutoWireExample.beans;



public class Country {

	// generate setters...
	private State state; // secondary type

	public void setState(State state) {
		this.state = state;
	}

	// print injected value on the console log
	public void display() {
		System.out.println("State name is: " + state.getStateName());
	}
}

