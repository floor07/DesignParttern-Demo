package decorator.impl;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class WhipDecorator  implements BeverageDecorator{
	Beverage beverage;
	
	public WhipDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescripation() {
		return this.beverage.getDescripation()+" add Whip ";
	}

	public Double cost() {
		return this.beverage.cost()+2.0d;
	}
}
