package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
	PersonBean personBean;
	
	
	public NonOwnerInvocationHandler(PersonBean personBean) {
		super();
		this.personBean = personBean;
	}


	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if(method.getName().startsWith("get")){
				return method.invoke(personBean, args);
			}else if(method.getName().equals("setHotOrNotRating")){
				return method.invoke(personBean, args);
			}else if(method.getName().startsWith("set")){
				throw new IllegalAccessException();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
