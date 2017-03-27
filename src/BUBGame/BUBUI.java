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
			System.out.println("준비하시고 엔터를 누르세요");
			int result = Integer.parseInt(sc.nextLine());

			String answer = bubmachine.checkNum(result);
			if (answer.equals("당첨")) {
				System.out.println(" 축 당첨 ");
				break;
			}

		}

	}

}
