package singleton;

public class HungrySingleton {
	private static HungrySingleton instance;
	
	private HungrySingleton(){
		
	}
	public  static HungrySingleton getInstance(){
		return instance;
	}
}
