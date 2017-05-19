package iterator;

public class Waitess {
	
	DinerMenu dinerMenu;
	PancakeHouseMenu pancakeHouseMenu;
	
	public Waitess(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
		super();
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}

	public void printMenu( ){
		 MyIterator<MenuItem> iterator=dinerMenu.createIterator();
		 MyIterator<MenuItem> iterator2=pancakeHouseMenu.createIterator();
		 printMenu(iterator);
		 printMenu(iterator2);
	}
	
	private  void printMenu( MyIterator<MenuItem> iterator){
		while(iterator.hasNext()){
			MenuItem item=iterator.next();
			System.out.println(item);
		}
	}
}
