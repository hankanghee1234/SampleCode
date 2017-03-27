package BUBGame;

public class BUBMachine {

	private String[] arr;

	public BUBMachine() {
		readyArray();
		checkPaper();

	}

	public void checkPaper() {
		for (int i = 0; i < 5; i++) {
			int result = (int) (Math.random() * 100);
			if (arr[result].equals("��÷")) {
				i--;
				continue;

			}
			arr[result] = "��÷";

		}

	}

	public void readyArray() {
		arr = new String[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "��";
		}

	}

	public String checkNum(int num) {

		return arr[num];
	}
}