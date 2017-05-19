package adapter;

import adapter.impl.WildDuck;
import adapter.impl.WildTurkey;

public class AdapterTest {

	public static void main(String[] args) {
		DuckTarget wildDuck=new WildDuck();
		wildDuck.fly();
		wildDuck.quack();
		TurkeyAdaptee adaptee=new WildTurkey();
		DuckTarget turkeyAdapter=new TurkeyAdapter(adaptee);
		turkeyAdapter.fly();
		turkeyAdapter.quack();
	}
}
