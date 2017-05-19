package adapter.impl;

import adapter.TurkeyAdaptee;

public class WildTurkey implements TurkeyAdaptee {

	public void gobble() {
		System.out.println("WildTurkey gobble");
	}

	public void fly() {
		System.out.println("WildTurkey fly a small distance");
	}

}
