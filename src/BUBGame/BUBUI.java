package BUBGame;

import java.util.Scanner;

public class BUBUI {

	private Scanner sc;
	private BUBMachine bubmachine;

	public BUBUI() {
		super();
		sc = new Scanner(System.in);
		bubmachine = new BUBMachine();
	}

	public void playGame() {
		while (true) {
			System.out.println("�غ��Ͻð� ���͸� ��������");
			int result = Integer.parseInt(sc.nextLine());

			String answer = bubmachine.checkNum(result);
			if (answer.equals("��÷")) {
				System.out.println(" �� ��÷ ");
				break;
			}

		}

	}

}
