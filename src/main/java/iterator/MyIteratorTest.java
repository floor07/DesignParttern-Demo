package iterator;

public class MyIteratorTest {

	public static void main(String[] args) {
		DinerMenu dinerMenu=new DinerMenu();
		PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
		Waitess waitess=new Waitess(dinerMenu, pancakeHouseMenu);
		waitess.printMenu();
	}
	
}
