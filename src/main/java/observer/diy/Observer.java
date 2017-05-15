package observer.diy;

/**  
* @ClassName: Observer <br/>
* @Description: 观察者<br/>  
* @author wenl <br/>
* @date 2017年5月15日 下午1:41:59  <br/>
*    
*/
public interface Observer {
	void update(Double temp,Double humidity,Double pressure);
}
