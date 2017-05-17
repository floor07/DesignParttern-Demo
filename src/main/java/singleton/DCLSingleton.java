package singleton;

public class DCLSingleton {
	private volatile static DCLSingleton instance;
	
	private DCLSingleton(){
		
	}
	public synchronized static DCLSingleton getInstance(){
		if(instance==null){
			synchronized (DCLSingleton.class) {
				if(instance==null){
					instance=new DCLSingleton();
				}
			}
		}
		return instance;
	}
}
