package QuizGame;

import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Quiz q1 = new Quiz("퀴즈게임", "1.누구? 2.누구? 3.누구?", 2);
		Quiz q2 = new Quiz("퀴즈게임", "1.누구? 2.누구? 3.누구?", 2);
		Quiz q3 = new Quiz("퀴즈게임", "1.누구? 2.누구? 3.누구?", 1);
		Quiz q4 = new Quiz("퀴즈게임", "1.누구? 2.누구? 3.누구?", 2);
		Quiz q5 = new Quiz("퀴즈게임", "1.누구? 2.누구? 3.누구?", 3);

		q1.next = q2;
		q2.next = q3;
		q3.next = q4;
		q4.next = q5;

		Quiz current = q1;
		
		
		while (true) {
			System.out.println("Enter를 치면 다음문제로 넘어갑니다.");
			scanner.nextLine();

			System.out.println(current.script);
			System.out.println(current.option);

			
			//user媛�踰덊샇瑜��낅젰 諛쏅뒗��
			int user = scanner.nextInt();
			
			if (current.answer==user) { 
				System.out.println("정답!!!");
				System.out.println("다음으로 넘어갑니다.");
				current = current.next;
				continue;
			}else{
				System.out.println("실패!!");
				System.out.println("문제를 완료합니다.!");
				break;
			}
			
		}

	}

	
}
