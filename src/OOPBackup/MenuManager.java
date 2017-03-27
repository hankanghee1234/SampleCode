package OOPBackup;

public enum MenuManager {
	
	//메뉴의 주문할 수량 변수 생성
	INSTANCE;
	private Menu[] orderArr;
	private int idx;
	private Menu order;
	
	//메뉴의 최대 주문 갯수 지정
	MenuManager() {
		orderArr = new Menu[10];
		idx = 0;
	}
	
	//메뉴판 생성
	public Menu[] getAllMenus() {
		return Menu.values();
	}// getAllMenus
	
	//추가하고자 하는 메뉴의 주문 수량 플러스 되는 과정
	public Menu[] addOrder(int orderNum) {
		orderArr[idx] = Menu.valueOf("M" + orderNum);
		orderArr[idx].setUpCount();
		idx++;
		return orderArr;
	}// addOrder
	
	//추가 메뉴를 취소하여 삭제 하고자 하는 주문 수량의 삭제 과정
	public Menu[] minusOrder(int orderNum) {
		order = Menu.valueOf("M" + Math.abs(orderNum));
		order.setDownCount();

		for (int i = 0; i < orderArr.length; i++) {
			if (orderArr[i] == order) {
				orderArr[i] = null;
				break;
			}
		}
		return orderArr;
	}// minusOrder

	//완료된 주문을 초기화하여 재 주문을 진행하는 과정
	public Menu[] resetMenu() {
		Menu[] menu = new Menu[10];
		orderArr = menu;
		return orderArr;
	}// resetMenu

}