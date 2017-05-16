package decorator.impl;

import decorator.Beverage;

public class HouseBlend  implements Beverage{

	public String getDescripation() {
		return "House Blend";
	}

	public Double cost() {
		return 1.1d;
	}

}
