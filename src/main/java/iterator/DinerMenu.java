package iterator;

public class DinerMenu {
	
	public class DinerMenuIterator implements MyIterator<MenuItem>{

		public boolean hasNext() {
			
			return position<MAX_ITEMS&&menuItems[position]!=null;
		}

		public MenuItem next() {
			return menuItems[position++];
		}
		
	}
	
	static final int MAX_ITEMS=6;
 	int numberOfItems=0;
 	MenuItem[]menuItems;
 	int position=0;
	public DinerMenu() {
		menuItems=new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", 
				"(Fakin)Bacon with lettuce & tomato on whole wheat ", true, 2.99);
		addItem("BLT", 
				"Bacon with lettuce & tomato on whole wheat ", false, 2.99);
		addItem("Soup of the day", 
				"Soup of the day,with a side of potato salad ", false, 2.29);
		addItem("Hotdog", 
				"A　hot dog, with saurkraut,relish,onions,topped with chesse ", false, 3.05);
	}

	public void addItem(
			String name,String description,
			boolean vegetarian,double price ){
		MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
		if(numberOfItems>=MAX_ITEMS){
			System.out.println("Sorry ,menu is full! Can't add item to menu");
		}else{
			menuItems[numberOfItems]=menuItem;
			numberOfItems++;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public MyIterator<MenuItem> createIterator(){
		return new DinerMenuIterator();
	}


}
