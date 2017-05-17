package singleton;

public class RegistrationSingleton {
	private static class RegistrationSingletonHolder{
		public static RegistrationSingleton instance=new RegistrationSingleton();
	}
	public  static RegistrationSingleton getInstance(){
		return RegistrationSingletonHolder.instance;
	}
}
