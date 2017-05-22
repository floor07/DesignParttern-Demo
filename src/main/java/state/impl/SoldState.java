package state.impl;

import state.GumballMachine;
import state.MyState;

public class SoldState implements MyState{

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}
	
	public void insertQuater() {
		System.out.println("Please wait,we 're already giving you a gumball");
	}

	public void ejectQuater() {
		System.out.println("Sorry,you already turned the crank");
	}

	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}

	public void dispense() {
		this.gumballMachine.releaseBall();
		if(gumballMachine.getCount()>0){
			this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
		}else{
			System.out.println("Sold out");
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		}
	}

}
