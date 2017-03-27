package OOPBackup;

import java.util.Scanner;

public enum MenuUI {
	
	UI;

	private Scanner scanner;

	MenuUI() {
		scanner = new Scanner(System.in);
	}

	public void showAllMenus() {

		System.out.println("==================�޴���===================");
		
		Menu[] arr = MenuManager.INSTANCE.getAllMenus();
		
		for (Menu menu : arr) {
			System.out.println(menu.getNum() + " " + menu.getMenuName() + " " + menu.getPrice());
		}

	}// showAllMenus

	public void OrderUI() {
		
		while (true) {
			int num = Integer.parseInt(scanner.nextLine());
			Menu[] orders;
			
			switch(num){
				case -1:
					orders = MenuManager.INSTANCE.minusOrder(num);
					System.out.println("�ֹ��� �����Ͽ����ϴ�~~!!");
					showAllMenus();
					break;
				case 0:
					orders = MenuManager.INSTANCE.resetMenu();
					System.out.println("�ʱ�ȭ �Ǿ����ϴ�~~!!");
					break;
				case 1:
					orders = MenuManager.INSTANCE.addOrder(num);
					System.out.println("��� �ֹ��Ͽ����ϴ�.");
					break;
				case 2:
					orders = MenuManager.INSTANCE.addOrder(num);
					System.out.println("��ġ�� �ֹ��Ͽ����ϴ�.");
					break;
				case 3:
					orders = MenuManager.INSTANCE.addOrder(num);
					System.out.println("�ٱݹٸ��� �ֹ��Ͽ����ϴ�.");
					break;
				default:
					orders = MenuManager.INSTANCE.addOrder(num);
					System.out.println("�ֹ��� �߰��ϰڽ��ϴ�~~!!");
					break;
			}
			
//			if (num < 0) {
//				orders = MenuManager.INSTANCE.minusOrder(num);
//			} else if (num == 0) {
//				orders = MenuManager.INSTANCE.resetMenu();
//				System.out.println("�ʱ�ȭ �Ǿ����ϴ�.  ~ !!!");
//				showAllMenus();
//			} else {
//				orders = MenuManager.INSTANCE.addOrder(num);
//			}

			int total = 0;

			for (Menu menu : orders) {
				if (menu == null) {
					continue;
				}
				System.out.println(menu.getMenuName() + " : " + menu.getPrice());
				// System.out.println(menu.getPrice());
				total += menu.getPrice();
				// System.out.println("=======================");
			}
			System.out.println("---------------");
			System.out.println("�߰���� : " + total);
			System.out.println("�ֹ��� ���� �ðڽ��ϱ�??????????");
			String answer = scanner.nextLine();

			if (answer.equals("y")) {
				System.out.println("==================������===================");
				for (int i = 0; i < 5; i++) {
					String imsi = "M" + (i + 1);
					if (Menu.valueOf(imsi).getCount() != 0) {
						System.out.println(
								Menu.valueOf(imsi).getMenuName() + "\t\t\t   " + Menu.valueOf(imsi).getCount());
					}
				}
				System.out.println("=================�ٴٱ⸰===================");
				System.out.println("�ѱݾ�    \t\t\t" + total);
				break;
			} else {
				showAllMenus();
				continue;
			}
		}
	}// addOrderUI
}
