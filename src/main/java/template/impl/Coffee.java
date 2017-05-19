package template.impl;

import template.CaffeineBeverageTemplate;

public class Coffee extends CaffeineBeverageTemplate {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
