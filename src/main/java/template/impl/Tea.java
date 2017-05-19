package template.impl;

import template.CaffeineBeverageTemplate;

public class Tea extends CaffeineBeverageTemplate {

	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}

}
