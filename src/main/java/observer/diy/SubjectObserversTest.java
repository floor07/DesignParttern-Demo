package observer.diy;

public class SubjectObserversTest {
	public static void main(String[] args) {
		Subject subject=new WeatherDataSubject();
		CurrentConditionsObserver observer1=new CurrentConditionsObserver(subject);
		CurrentConditionsObserver observer2=new CurrentConditionsObserver(subject);
		subject.setMeasurements(18.0, 23.0, 35.0);
		observer1.display();
		observer2.display();
		subject.setMeasurements(19.0, 24.0, 36.0);
		observer1.display();
		observer2.display();
	}
}
