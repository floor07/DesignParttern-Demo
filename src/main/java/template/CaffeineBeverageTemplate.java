package template;

public abstract class CaffeineBeverageTemplate {
   final void prepareRecipe(){
	   boilWater();
	   brew();
	   pourInCup();
	   addCondiments();
   }
   public abstract void brew();
   public abstract void addCondiments();
   void boilWater(){
	   System.out.println("Boilling water");
   }
   void pourInCup(){
	   System.out.println("Pouring into cup");
   }
   
}
