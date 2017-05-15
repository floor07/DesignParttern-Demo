package observer.inner;

public class InnerSubjectObserversTest {
	public static void main(String[] args) {
		WeatherDataObservable weatherDataObservable=new WeatherDataObservable();
		CurrentConditionsObserver observer=new CurrentConditionsObserver(weatherDataObservable);
		CurrentConditionsObserver observer2=new CurrentConditionsObserver(weatherDataObservable);
		weatherDataObservable.setMeasurements(18.0, 19.0, 20.0);
		observer.display();
		observer2.display();
	}
}
