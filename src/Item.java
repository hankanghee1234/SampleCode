
public class Item {
	String name;
	int value;

	public Item(int value) {
		this.value = value;

		switch (value) {
		case 0:
			this.name = "가위";
			break;
		case 1:
			this.name = "바위";
			break;
		case 2:
			this.name = "보";
			break;
		default:
			this.name = "가위";
		}
	}

	public int askWin(Item com) {
		int comValue = com.value < this.value ? com.value + 3 : com.value;
		return comValue - this.value;
	}
}
