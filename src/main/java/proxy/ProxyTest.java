package proxy;

import java.lang.reflect.Proxy;

import proxy.impl.PersonBeanImpl;

public class ProxyTest {

	public static PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(),new OwnerInvocationHandler(person));
	}
	public static PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(),new NonOwnerInvocationHandler(person));
	}
	public static void main(String[] args) {
		PersonBean person=new PersonBeanImpl();
		PersonBean ownerProxy=getOwnerProxy(person);
		PersonBean nonOwnerProxy=getNonOwnerProxy(person);
		try {
			ownerProxy.setHotOrNotRating(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ownerProxy.setName("WL");
		try {
			nonOwnerProxy.setName("SB");
		} catch (Exception e) {
			e.printStackTrace();
		}
		nonOwnerProxy.setHotOrNotRating(100000);
		System.out.println(person);
	}
}
