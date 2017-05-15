package observer.inner;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsObserver implements Observer{
	private Observable observable;
	private Double temperature;
	private Double humidity;
	private Double pressure;
	

	public CurrentConditionsObserver(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		
		if (observable instanceof WeatherDataObservable){
			System.out.println("update time is "+arg);
			WeatherDataObservable weatherData=(WeatherDataObservable)observable;
			this.temperature=weatherData.getTemp();
			this.humidity=weatherData.getHumidity();
			this.pressure=weatherData.getPressure();
		}else{
			this.temperature=0.0d;
			this.humidity=0.0d;
			this.pressure=0.0d;
		}
	}

	public void display() {
		System.out.println("CurrentConditionsDisplay [temperature=" + temperature + ", humidity=" + humidity + ", pressure="
				+ pressure + "]");
	}

}
