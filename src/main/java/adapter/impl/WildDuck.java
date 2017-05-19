package adapter.impl;

import adapter.DuckTarget;

public class WildDuck implements DuckTarget{

	public void quack() {
		System.out.println("WildDuck quack");
	}

	public void fly() {
		System.out.println("WildDuck fly");
	}

}
