package com.SpringAutoWireExample.beans;


public class City {

	private State state;

	// parameterized constructor
	public City(State state) {
		this.state = state;
	}

	public void print() {
		System.out.println("Varanasi is a city in " + state.getStateName() + " state.");
	}
}