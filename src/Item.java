
public class Item {
	String name;
	int value;

	public Item(int value) {
		this.value = value;

		switch (value) {
		case 0:
			this.name = "����";
			break;
		case 1:
			this.name = "����";
			break;
		case 2:
			this.name = "��";
			break;
		default:
			this.name = "����";
		}
	}

	public int askWin(Item com) {
		int comValue = com.value < this.value ? com.value + 3 : com.value;
		return comValue - this.value;
	}
}
