package factory;

/**  
* @ClassName: SimpleFactoryDemo <br/>
* @Description: 简单工厂，非设计模式，将创建对象的部分移动到了统一的部分中<br/>  
* @author wenl <br/>
* @date 2017年5月10日 下午4:52:10  <br/>
*    
*/
public class SimpleFactoryDemo {

	public static abstract class Pizza{
		private String type;
		
		public Pizza(String type) {
			super();
			this.type = type;
		}
		public void prepare(){
			System.out.println(" This "+type+" prizz is prepared");
		}
		public  void bake(){
			System.out.println(" This "+type+" prizz is bake");
		}
		public void cut(){
			System.out.println(" This "+type+" prizz is cutted");
		}
		public void box(){
			System.out.println(" This "+type+" prizz in box!!!");
		}
	}
	public static class ChessePizza extends Pizza{

		public ChessePizza() {
			super("cheese");
		}
	}
	public static class PepperoniPizza extends Pizza{

		public PepperoniPizza() {
			super("pepperoni");
		}
	}
	public static class VeggiePizza extends Pizza{
		public VeggiePizza() {
			super("veggie");
		}
	}
	
	/**  
	* @ClassName: SimplePrizzaFactory <br/>
	* @Description: 简单Pizza工厂<br/>  
	* @author wenl <br/>
	* @date 2017年5月10日 下午4:32:19  <br/>
	*    
	*/
	public static class SimplePizzaFactory{
		
		public  Pizza createPizza(String type){
			Pizza pizza=null;
			if("cheese".equals(type)){
				pizza=new ChessePizza();
			}else if("pepperoni".equals(type)){
				pizza=new PepperoniPizza();
			}else if("veggie".equals(type)){
				pizza=new VeggiePizza();
			}
			return pizza;
		}
	}
	
	public static class PizzaStore{
		SimplePizzaFactory factory;
		public PizzaStore(SimplePizzaFactory factory){
			this.factory=factory;
		}
		public Pizza orderPizza(String type){
			Pizza pizza=null;
			pizza=factory.createPizza(type);
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			return pizza;
		}

	}
	public static void main(String[] args) {
		
		SimplePizzaFactory factory=new SimplePizzaFactory();
		PizzaStore pizzaStore=new PizzaStore(factory);
		pizzaStore.orderPizza("veggie");
	}
}
