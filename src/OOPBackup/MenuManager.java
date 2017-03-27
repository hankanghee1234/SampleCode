package OOPBackup;

public enum MenuManager {
	
	//�޴��� �ֹ��� ���� ���� ����
	INSTANCE;
	private Menu[] orderArr;
	private int idx;
	private Menu order;
	
	//�޴��� �ִ� �ֹ� ���� ����
	MenuManager() {
		orderArr = new Menu[10];
		idx = 0;
	}
	
	//�޴��� ����
	public Menu[] getAllMenus() {
		return Menu.values();
	}// getAllMenus
	
	//�߰��ϰ��� �ϴ� �޴��� �ֹ� ���� �÷��� �Ǵ� ����
	public Menu[] addOrder(int orderNum) {
		orderArr[idx] = Menu.valueOf("M" + orderNum);
		orderArr[idx].setUpCount();
		idx++;
		return orderArr;
	}// addOrder
	
	//�߰� �޴��� ����Ͽ� ���� �ϰ��� �ϴ� �ֹ� ������ ���� ����
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

	//�Ϸ�� �ֹ��� �ʱ�ȭ�Ͽ� �� �ֹ��� �����ϴ� ����
	public Menu[] resetMenu() {
		Menu[] menu = new Menu[10];
		orderArr = menu;
		return orderArr;
	}// resetMenu

}