package state.impl;

import state.GumballMachine;
import state.MyState;

public class NoQuarterState implements MyState{

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}
	
	public void insertQuater() {
		System.out.println("You insert a Quater!");
		this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
	}

	public void ejectQuater() {
		System.out.println("You haven't insert a quater");
	}

	public void turnCrank() {
		System.out.println("You turned ,but there 's no quarter");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}

}
