package decorator.impl;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class MilkDecorator implements BeverageDecorator {
	Beverage beverage;
	
	public MilkDecorator(Beverage beverage){
		this.beverage=beverage;
	}
	
	public String getDescripation() {
		return this.beverage.getDescripation()+" add milk";
	}

	public Double cost() {
		return this.beverage.cost()+0.5d;
	}

}
