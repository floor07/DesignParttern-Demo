package state.impl;

import state.GumballMachine;
import state.MyState;

public class SoldOutState implements MyState{

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}
	
	public void insertQuater() {
		System.out.println("You can't insert a quater ,because it's SoldOut!!");
	}

	public void ejectQuater() {
		System.out.println("You can't eject a quater ,because it's SoldOut!!");
	}

	public void turnCrank() {
		System.out.println("You can't turn Crank ,because it's SoldOut!!");
	}

	public void dispense() {
		System.out.println("No gumball dispense");
	}

}
