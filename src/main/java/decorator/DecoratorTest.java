package decorator;

import decorator.impl.DarkRoast;
import decorator.impl.MilkDecorator;
import decorator.impl.MochaDecorator;
import decorator.impl.SoyDecorator;
import decorator.impl.WhipDecorator;

public class DecoratorTest {
public static void main(String[] args) {
	Beverage beverage=new DarkRoast();
	BeverageDecorator addmilk=new MilkDecorator(beverage);
	BeverageDecorator addsoy=new SoyDecorator(addmilk);
	BeverageDecorator addWhip=new WhipDecorator(addsoy);
	BeverageDecorator addMocha=new MochaDecorator(addWhip);
	System.out.println(addMocha.getDescripation());
	System.out.println(addMocha.cost());
	 addMocha=new MilkDecorator(addMocha);
	System.out.println(addMocha.getDescripation());
	System.out.println(addMocha.cost());
}
}
