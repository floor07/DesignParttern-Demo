package state.impl;

import java.util.Random;

import state.GumballMachine;
import state.MyState;

public class HasQuarterState implements MyState{
	Random randomWinner=new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}
	
	public void insertQuater() {
		System.out.println("You already inserted a quarter!");
	}

	public void ejectQuater() {
		System.out.println("You eject a quarter!");
		this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("You turnCrack");
		int winner=randomWinner.nextInt(10);
		if(winner==0&&this.gumballMachine.getCount()>1){
			this.gumballMachine.setState(this.gumballMachine.getWinnerQuater());
		}else{
			this.gumballMachine.setState(this.gumballMachine.getSoldState());
		}
	}

	public void dispense() {
		System.out.println("No gumball dispense");
	}

}
