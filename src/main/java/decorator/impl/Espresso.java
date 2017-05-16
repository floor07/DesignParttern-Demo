package decorator.impl;

import decorator.Beverage;

public class Espresso implements Beverage{

	public String getDescripation() {
		return "Espresso";
	}

	public Double cost() {
		return 1.2d;
	}

}
