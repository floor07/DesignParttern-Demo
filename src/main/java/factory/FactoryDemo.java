package factory;


/**  
* @ClassName: FactoryDemo <br/>
* @Description: 工厂模式<br/>  
* @author wenl <br/>
* @date 2017年5月10日 下午5:19:45  <br/>
*    
*/
public class FactoryDemo {
	
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
	public static class NYChessePizza extends Pizza{

		public NYChessePizza() {
			super("NY.cheese");
		}
	}
	public static class NYPepperoniPizza extends Pizza{

		public NYPepperoniPizza() {
			super("NY.pepperoni");
		}
	}
	public static class NYVeggiePizza extends Pizza{
		public NYVeggiePizza() {
			super("NY.veggie");
		}
	}
	public static class ChicageChessePizza extends Pizza{

		public ChicageChessePizza() {
			super("Chicage.cheese");
		}
	}
	public static class ChicagePepperoniPizza extends Pizza{

		public ChicagePepperoniPizza() {
			super("Chicage.pepperoni");
		}
	}
	public static class ChicageVeggiePizza extends Pizza{
		public ChicageVeggiePizza() {
			super("Chicage.veggie");
		}
	}
	
	public static abstract class PizzaStore{
		
		public Pizza orderPizza(String type){
			Pizza pizza=null;
			pizza=createPizza(type);
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			return pizza;
		}
		
		public abstract Pizza createPizza(String type);
	}
	
	public static class NYPizzaStore extends PizzaStore{

		@Override
		public Pizza createPizza(String type) {
			Pizza pizza=null;
			if("cheese".equals(type)){
				pizza=new NYChessePizza();
			}else if("pepperoni".equals(type)){
				pizza=new NYPepperoniPizza();
			}else if("veggie".equals(type)){
				pizza=new NYVeggiePizza();
			}
			return pizza;
		}
		
	}
	
	public static class ChicagePizzaStore extends PizzaStore{

		@Override
		public Pizza createPizza(String type) {
			Pizza pizza=null;
			if("cheese".equals(type)){
				pizza=new ChicageChessePizza();
			}else if("pepperoni".equals(type)){
				pizza=new ChicagePepperoniPizza();
			}else if("veggie".equals(type)){
				pizza=new ChicageVeggiePizza();
			}
			return pizza;
		}
		
	}
	
	public static void main(String[] args) {
		//调用者，知悉使用的子类
		PizzaStore pizzaStore=new NYPizzaStore();
		pizzaStore.orderPizza("veggie");
		 pizzaStore=new ChicagePizzaStore();
		 pizzaStore.orderPizza("veggie");
	}
}
