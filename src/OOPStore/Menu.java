package OOPStore;

public enum Menu {
	
	
	M1(1, "¥���", 3300), 
	M2(2, "������", 5300), 
	M3(3, "������", 8900), 
	M4(4, "��ٷο�", 13500), 
	M5(5, "���", 2200);
	
	
	private int num;
	private String menuName;
	private int price;
	
	
	Menu(int num, String name, int price) {
		this.num = num;
		this.menuName = name;
		this.price = price;
	}
	
	
	public int getNum() {
		return num;
	}

	public String getMenuName() {
		return menuName;
	}

	public int getPrice() {
		return price;
	}

}
