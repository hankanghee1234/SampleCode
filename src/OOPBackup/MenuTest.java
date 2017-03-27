package OOPBackup;


public class MenuTest {

	public static void main(String[] args) {
		System.out.println(Menu.M1.getMenuName()); // 메뉴를 출력
		System.out.println(Menu.M2.getMenuName());
		System.out.println(Menu.M3.getMenuName());
		System.out.println(Menu.M4.getMenuName());
		System.out.println(Menu.M5.getMenuName());

		System.out.println(Menu.values()); // 전체 메뉴가 배열로 출력
	}
}
