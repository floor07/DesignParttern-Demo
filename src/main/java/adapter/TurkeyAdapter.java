package adapter;

public class TurkeyAdapter implements DuckTarget {
	
	TurkeyAdaptee turkeyAdaptee;
	
	
	public TurkeyAdapter(TurkeyAdaptee turkeyAdaptee) {
		this.turkeyAdaptee = turkeyAdaptee;
	}

	public void quack() {
		turkeyAdaptee.gobble();
	}

	public void fly() {
		for(int i=0;i<5;i++){
			turkeyAdaptee.fly();
		}
	}

}
