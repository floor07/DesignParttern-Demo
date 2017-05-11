package factory;



public class AbstractFactoryDemo {
	public static abstract class Pizza{
		protected Dough dough;
		protected Sauce sauce;
		protected Cheese cheese;
		public void prepare(){
			System.out.println(" This "+dough.name+":"+this.sauce.name+":"+this.cheese.name+" prizz is prepared");
		}
		public  void bake(){
			System.out.println(" This "+dough.name+":"+this.sauce.name+":"+this.cheese.name+" prizz is bake");
		}
		public void cut(){
			System.out.println(" This "+dough.name+":"+this.sauce.name+":"+this.cheese.name+" prizz is cutted");
		}
		public void box(){
			System.out.println(" This "+dough.name+":"+this.sauce.name+":"+this.cheese.name+" prizz in box!!!");
		}
	}
	public static class ChessePizza extends Pizza{
		PizzaIngredientFactory pizzaIngredientFactory;
		public ChessePizza(PizzaIngredientFactory pizzaIngredientFactory) {
			this.pizzaIngredientFactory=pizzaIngredientFactory;
			this.dough=pizzaIngredientFactory.createDough();
			this.sauce=pizzaIngredientFactory.createSauce();
			this.cheese=pizzaIngredientFactory.createChesse();
		}
	}
	public static class PepperoniPizza extends Pizza{
		PizzaIngredientFactory pizzaIngredientFactory;
		public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
			this.pizzaIngredientFactory=pizzaIngredientFactory;
			this.dough=pizzaIngredientFactory.createDough();
			this.sauce=pizzaIngredientFactory.createSauce();
			this.cheese=pizzaIngredientFactory.createChesse();
		}
	}
	public static class VeggiePizza extends Pizza{
		PizzaIngredientFactory pizzaIngredientFactory;
		public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
			this.pizzaIngredientFactory=pizzaIngredientFactory;
			this.dough=pizzaIngredientFactory.createDough();
			this.sauce=pizzaIngredientFactory.createSauce();
			this.cheese=pizzaIngredientFactory.createChesse();
		}
	}
	// ----------Dough---------
	public static abstract class Dough{
		protected String name;
		public Dough(String name){
			this.name=name;
		}
		public String getName() {
			return name;
		}	
	}
	
	public static class ThinCrustDough extends Dough{
		public ThinCrustDough() {
			super("Thin Crust Pizza Dough");
		}
	}
	
	public static class ThickCurstDough extends Dough{
		public ThickCurstDough() {
			super("Thick Crust Pizza Dough");
		}
	}
	//--------------------------------------
	//-----------------Sauce--------------------
	public static abstract class Sauce{
		protected String name;
		public Sauce(String name){
			this.name=name;
		}
	}
	
	public static class PlumTomatoSauce extends Sauce{
		public PlumTomatoSauce() {
			super("Plum Tomato Sauce ");
		}
	}
	
	public static class FishSauce extends Sauce{
		public FishSauce() {
			super("Fish Sauce");
		}
	}
	//-------------------------------------
	//-----------------Cheese--------------
	public static abstract class Cheese{
		protected String name;
		public Cheese(String name){
			this.name=name;
		}
	}
	
	public static class BlueCheese extends Cheese{
		public BlueCheese() {
			super("Blue Cheese");
		}
	}
	
	public static class ParmesanCheese extends Cheese{
		public ParmesanCheese() {
			super("Parmesan Cheese");
		}
	}
	//------------------------------------
	/**  
	* @ClassName: PizzaIngredientFactory <br/>
	* @Description: 抽象工厂类<br/>  
	* @author wenl <br/>
	* @date 2017年5月11日 下午1:52:55  <br/>
	*/
	public static interface PizzaIngredientFactory{
		public Dough createDough();
		public Sauce createSauce();
		public Cheese createChesse();
	}
	
	public static class NYPizzaIngredientFactory implements PizzaIngredientFactory{

		public Dough createDough() {
			return new ThickCurstDough();
		}

		public Sauce createSauce() {
			return new FishSauce();
		}
		public Cheese createChesse() {
			return new BlueCheese();
		}
	}
	
	public static class  ChicagePizzaIngredientFactory implements PizzaIngredientFactory{

		public Dough createDough() {
			return new ThinCrustDough();
		}

		public Sauce createSauce() {
			return new PlumTomatoSauce();
		}

		public Cheese createChesse() {
			return new ParmesanCheese();
		}
		
	}
	//--------------------------------------------------------
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
			PizzaIngredientFactory pizzaIngredientFactory=new NYPizzaIngredientFactory();
			
			if("cheese".equals(type)){
				pizza=new ChessePizza(pizzaIngredientFactory);
			}else if("pepperoni".equals(type)){
				pizza=new PepperoniPizza(pizzaIngredientFactory);
			}else if("veggie".equals(type)){
				pizza=new VeggiePizza(pizzaIngredientFactory);
			}
			return pizza;
		}
		
	}
	public static class ChicagePizzaStore extends PizzaStore{

		@Override
		public Pizza createPizza(String type) {
			Pizza pizza=null;
			PizzaIngredientFactory pizzaIngredientFactory=new ChicagePizzaIngredientFactory();
			
			if("cheese".equals(type)){
				pizza=new ChessePizza(pizzaIngredientFactory);
			}else if("pepperoni".equals(type)){
				pizza=new PepperoniPizza(pizzaIngredientFactory);
			}else if("veggie".equals(type)){
				pizza=new VeggiePizza(pizzaIngredientFactory);
			}
			return pizza;
		}
		
	}
	public static void main(String[] args) {
		PizzaStore pizzaStore=new NYPizzaStore();
		pizzaStore.orderPizza("cheese");
		pizzaStore=new ChicagePizzaStore();
		pizzaStore.orderPizza("cheese");
	}

}
