package decorator.impl;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class SoyDecorator implements BeverageDecorator {
	Beverage beverage;
	public SoyDecorator(Beverage beverage){
		this.beverage=beverage;
	}
	
	
	public String getDescripation() {
		return this.beverage.getDescripation()+" add Soy ";
	}

	public Double cost() {
		return this.beverage.cost()+1.0d;
	}

}
