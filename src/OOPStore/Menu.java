package OOPStore;

public enum Menu {
	
	
	M1(1, "Â¥Àå¸é", 3300), 
	M2(2, "ººÀ½¹ä", 5300), 
	M3(3, "ÅÁ¼öÀ°", 8900), 
	M4(4, "²ã¹Ù·Î¿ì", 13500), 
	M5(5, "±è¹ä", 2200);
	
	
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
