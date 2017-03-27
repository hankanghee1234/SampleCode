package OOPStore;

public enum MenuManager {

	INSTANCE;

	private Menu[] orderArr;
	private int idx;
	
	MenuManager() {
		orderArr = new Menu[10];
		idx = 0;
	}
	
	public Menu[] getAllMenus() {

		return Menu.values();
	}
	
	public Menu[] addOrder(int orderNum) {

		orderArr[idx++] = Menu.valueOf("M" + orderNum);

		return orderArr;

	}

}
