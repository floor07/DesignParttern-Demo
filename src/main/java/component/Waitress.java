package component;

public class Waitress {
	MenuComponent allMenu;

	public void printMenu(){
		allMenu.print();
	}

	public  Waitress(MenuComponent allMenu) {
		this.allMenu = allMenu;
	}
	
}
