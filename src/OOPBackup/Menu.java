package OOPBackup;

public enum Menu {

	// ��ü ����
	M1(1, "����", 10000, 0), 
	M2(2, "��ġ", 30000, 0), 
	M3(3, "�ٱݹٸ�", 100000, 0), 
	M4(4, "���", 40000, 0), 
	M5(5, "���", 60000, 0);
	
	//�Է��ϰ��� �ϴ� ���� ����
	private int num;
	private String menuName;
	private int price;
	private int count;

	//������ Ȯ��
	Menu(int num, String name, int price, int count) {
		this.num = num;
		this.menuName = name;
		this.price = price;
		this.count = count;
	}
	//���� num�� ���� ����
	public int getNum() {
		return num;
	}
	//���� �޴��� ���� ���� ����
	public String getMenuName() {
		return menuName;
	}
	//���� ���ݿ� ���� ���� ����
	public int getPrice() {
		return price;
	}
	//���� count������ ���� ����
	public int getCount() {
		return count;
	}
	//���� count�� ���� ���� ����(�߰� �� �÷��� �߻�)
	public void setUpCount() {
		count += 1;
	}
	//���� count�� ���� ���� ����(���� �� ���̳ʽ� �߻�)
	public void setDownCount() {
		count -= 1;
	}

}
