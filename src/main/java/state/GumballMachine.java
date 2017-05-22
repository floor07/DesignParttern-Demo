package state;

import state.impl.HasQuarterState;
import state.impl.NoQuarterState;
import state.impl.SoldOutState;
import state.impl.SoldState;
import state.impl.WinnerState;

public class GumballMachine {
	MyState state;
	SoldOutState soldOutState;
	NoQuarterState noQuarterState;
	HasQuarterState hasQuarterState;
	SoldState soldState;
	WinnerState winnerState;
	int count=20;
	
	public void releaseBall(){
		System.out.println("GumballMachine release a ball");
		count--;
	}
	
	public int getCount() {
		return count;
	}


	public GumballMachine(int count) {
		this.count=count;
		this.state = new NoQuarterState(this);
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState=new WinnerState(this);
	}
	public MyState getState() {
		return state;
	}
	public SoldOutState getSoldOutState() {
		return soldOutState;
	}
	public NoQuarterState getNoQuarterState() {
		return noQuarterState;
	}
	public HasQuarterState getHasQuarterState() {
		return hasQuarterState;
	}
	public SoldState getSoldState() {
		return soldState;
	}
	
	public WinnerState getWinnerQuater() {
		return winnerState;
	}

	public void setState(MyState state) {
		this.state = state;
	}

	public void insertQuater() {
		state.insertQuater();
		
	}

	public void ejectQuater() {
		state.ejectQuater();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
	
}
