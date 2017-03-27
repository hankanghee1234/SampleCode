package OOPBackup;

public enum Menu {

	// 객체 생성
	M1(1, "광어", 10000, 0), 
	M2(2, "참치", 30000, 0), 
	M3(3, "다금바리", 100000, 0), 
	M4(4, "농어", 40000, 0), 
	M5(5, "방어", 60000, 0);
	
	//입력하고자 하는 변수 지정
	private int num;
	private String menuName;
	private int price;
	private int count;

	//생성자 확인
	Menu(int num, String name, int price, int count) {
		this.num = num;
		this.menuName = name;
		this.price = price;
		this.count = count;
	}
	//변수 num의 게터 생성
	public int getNum() {
		return num;
	}
	//변수 메뉴에 대한 게터 생성
	public String getMenuName() {
		return menuName;
	}
	//변수 가격에 대한 게터 생성
	public int getPrice() {
		return price;
	}
	//변수 count에대한 게터 생성
	public int getCount() {
		return count;
	}
	//변수 count에 대한 세터 생성(추가 시 플러스 발생)
	public void setUpCount() {
		count += 1;
	}
	//변수 count에 대한 세터 생성(삭제 시 마이너스 발생)
	public void setDownCount() {
		count -= 1;
	}

}
