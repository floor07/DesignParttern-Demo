package decorator.impl;

import decorator.Beverage;

public class Decaf implements Beverage{

	public String getDescripation() {
		return "Decaf";
	}

	public Double cost() {
		return 2.0d;
	}

}
