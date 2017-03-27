package OOPStore;

import java.util.Arrays;

public class MenuTest {

	public static void main(String[] args) {

		System.out.println(Menu.M1.getMenuName());
		System.out.println(Menu.M2.getMenuName());
		System.out.println(Menu.M3.getMenuName());

		String str = "M3";

		System.out.println(Menu.valueOf(str).getMenuName());

		Menu[] arr = { Menu.M1, Menu.M2 };

	}
}
