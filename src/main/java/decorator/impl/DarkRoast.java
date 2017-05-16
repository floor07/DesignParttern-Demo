package decorator.impl;

import decorator.Beverage;

public class DarkRoast implements Beverage {

	public String getDescripation() {
		return "Dark Roast";
	}

	public Double cost() {
		return 1.0d;
	}

}
