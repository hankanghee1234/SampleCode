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
			if (arr[result].equals("´çÃ·")) {
				i--;
				continue;

			}
			arr[result] = "´çÃ·";

		}

	}

	public void readyArray() {
		arr = new String[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "²Î";
		}

	}

	public String checkNum(int num) {

		return arr[num];
	}
}