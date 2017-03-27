package OOPBackup;

import java.util.Scanner;

public enum MenuUI {
	
	UI;

	private Scanner scanner;

	MenuUI() {
		scanner = new Scanner(System.in);
	}

	public void showAllMenus() {

		System.out.println("==================메뉴판===================");
		
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
					System.out.println("주문을 삭제하였습니다~~!!");
					showAllMenus();
					break;
				case 0:
					orders = MenuManager.INSTANCE.resetMenu();
					System.out.println("초기화 되었습니다~~!!");
					break;
				case 1:
					orders = MenuManager.INSTANCE.addOrder(num);
					System.out.println("광어를 주문하였습니다.");
					break;
				case 2:
					orders = MenuManager.INSTANCE.addOrder(num);
					System.out.println("참치를 주문하였습니다.");
					break;
				case 3:
					orders = MenuManager.INSTANCE.addOrder(num);
					System.out.println("다금바리를 주문하였습니다.");
					break;
				default:
					orders = MenuManager.INSTANCE.addOrder(num);
					System.out.println("주문을 추가하겠습니다~~!!");
					break;
			}
			
//			if (num < 0) {
//				orders = MenuManager.INSTANCE.minusOrder(num);
//			} else if (num == 0) {
//				orders = MenuManager.INSTANCE.resetMenu();
//				System.out.println("초기화 되었습니다.  ~ !!!");
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
			System.out.println("중간계산 : " + total);
			System.out.println("주문을 끝내 시겠습니까??????????");
			String answer = scanner.nextLine();

			if (answer.equals("y")) {
				System.out.println("==================영수증===================");
				for (int i = 0; i < 5; i++) {
					String imsi = "M" + (i + 1);
					if (Menu.valueOf(imsi).getCount() != 0) {
						System.out.println(
								Menu.valueOf(imsi).getMenuName() + "\t\t\t   " + Menu.valueOf(imsi).getCount());
					}
				}
				System.out.println("=================바다기린===================");
				System.out.println("총금액    \t\t\t" + total);
				break;
			} else {
				showAllMenus();
				continue;
			}
		}
	}// addOrderUI
}
