package observer.inner;

import java.util.Observable;

/**  
* @ClassName: WeatherDataSubject <br/>
* @Description: 主题的一个实现类<br/>  
* @author wenl <br/>
* @date 2017年5月15日 下午1:57:59  <br/>
*    
*/
public class WeatherDataObservable extends Observable {
	
	private Double temp;
	private Double humidity;
	private Double pressure;
	
	public Double getTemp() {
		return temp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public Double getPressure() {
		return pressure;
	}

	public void setMeasurements(Double temp,Double humidity,Double pressure){
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		changeMeasurements();
		
	}

	public void changeMeasurements(){
		 setChanged();
		 notifyObservers(System.currentTimeMillis());
	}
}
