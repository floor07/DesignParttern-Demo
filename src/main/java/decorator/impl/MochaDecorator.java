package decorator.impl;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class MochaDecorator  implements BeverageDecorator{
	Beverage beverage;
	public MochaDecorator(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescripation() {
		return this.beverage.getDescripation()+" add Mocha";
	}

	public Double cost() {
		return this.beverage.cost()+1.5d;
	}

}
