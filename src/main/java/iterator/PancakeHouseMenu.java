package iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
	
	public  class PancakeHouseMenuIterator implements MyIterator<MenuItem>{
		public boolean hasNext() {
			return position<menuItems.size();
		}

		public MenuItem next() {
			return menuItems.get(position++);
		}
	}
	
	private ArrayList<MenuItem> menuItems;
	int position=0;
	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<MenuItem>();
		addItem("K&B Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast", 
				true, 
				2.99);
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage", 
				false, 
				2.99);
		addItem("Blueberry Pancakes ",
				"Pancakes made with fresh blueberries ", 
				true, 
				3.49);
		addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries", 
				true, 
				3.59);
	}
	
	public void addItem(
			String name,String description,
			boolean vegetarian,double price ){
		MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
		this.menuItems.add(menuItem);
	}
	public ArrayList<MenuItem> getMenuItems(){
		return this.menuItems;
	}
	
	public MyIterator<MenuItem> createIterator(){
		return new PancakeHouseMenuIterator();
	}

}
