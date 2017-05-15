package observer.diy;

public class CurrentConditionsObserver implements Observer,DisplayElement {
	private Double temperature;
	private Double humidity;
	private Double pressure;
	private Subject weatherData;
	
	public CurrentConditionsObserver(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("CurrentConditionsDisplay [temperature=" + temperature + ", humidity=" + humidity + ", pressure="
				+ pressure + "]");
	}


	public void update(Double temperature, Double humidity, Double pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
	}

}
