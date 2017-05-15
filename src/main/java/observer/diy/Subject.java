package observer.diy;

import java.util.ArrayList;
import java.util.List;

/**  
* @ClassName: Subject <br/>
* @Description: 主题对象用于，注册，移除，通知<br/>  
* @author wenl <br/>
* @date 2017年5月15日 下午1:41:24  <br/>
*    
*/
public interface Subject {
	List<Observer> observers=new ArrayList<Observer>();
	boolean registerObserver(Observer observer);
	boolean removeObserver(Observer observer);
	void notifyObservers();
	 void setMeasurements(Double temp,Double humidity,Double pressure);
}
