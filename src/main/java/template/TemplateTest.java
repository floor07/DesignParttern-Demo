package template;

import template.impl.Coffee;
import template.impl.Tea;

public class TemplateTest {
 public static void main(String[] args) {
	 CaffeineBeverageTemplate tea=new Tea();
	 CaffeineBeverageTemplate coffee=new Coffee();
	 tea.prepareRecipe();
	 coffee.prepareRecipe();
 }
}
