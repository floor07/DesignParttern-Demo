package observer.diy;

import java.util.ArrayList;
import java.util.List;

/**  
* @ClassName: WeatherDataSubject <br/>
* @Description: 主题的一个实现类<br/>  
* @author wenl <br/>
* @date 2017年5月15日 下午1:57:59  <br/>
*    
*/
public class WeatherDataSubject implements Subject {
	

	private Double temp;
	private Double humidity;
	private Double pressure;
	List<Observer> observers=new ArrayList<Observer>();
	public void setMeasurements(Double temp,Double humidity,Double pressure){
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		changeMeasurements();
	}
	public void changeMeasurements(){
		 notifyObservers();
	}
	
	public boolean registerObserver(Observer observer) {
		return observers.add(observer);
	}

	public boolean removeObserver(Observer observer) {
		return observers.remove(observer);
	}

	public void notifyObservers() {
		for(Observer observer:observers){
			observer.update(temp, humidity,pressure);
		}
	}

}
