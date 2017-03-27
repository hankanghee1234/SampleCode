package OOPStore;

import java.util.Scanner;

public enum MenuUI {

	UI;

	private Scanner scanner;

	MenuUI() {
		scanner = new Scanner(System.in);
	}

	public void showAllMenus() {

		Menu[] arr = MenuManager.INSTANCE.getAllMenus();

		for (Menu menu : arr) {
			System.out.println(menu.getNum() + ":" + menu.getMenuName() + ":" + menu.getPrice());
		}
	}

	public void addOrderUI() {

		while (true) {

			
			int num = Integer.parseInt(scanner.nextLine());

			
			if (num == -1) {
				System.out.println("�ֹ��� ��Ĩ�ϴ�.");
				break;
			}

			Menu[] orders = MenuManager.INSTANCE.addOrder(num);

			int total = 0;

			for (Menu menu : orders) {
				if (menu == null) {
					continue;
				}

				System.out.println(menu.getMenuName() + ":" + menu.getPrice());
				System.out.println(menu.getPrice());
				total += menu.getPrice();
			}

			System.out.println("---------------------");
			System.out.println("�� �ݾ�:" + total);

		}

	}
}
