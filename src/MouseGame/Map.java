package MouseGame;


import java.util.Arrays;
import java.util.Scanner;

public class Map {

	// 헌터와 쥐의 변수 선언
	private MouseHunter hunter;
	private Mouse targetMouse;
	private Scanner scanner;
	private Radar radar;

	// 쥐의 움직이는 위치
	public void targetMouse() {
		this.scanner = new Scanner(System.in);
		this.targetMouse.moveMouse();
	}

	// 헌터의 움직이는 위치
	public void hunter() {
		this.scanner = new Scanner(System.in);
		this.hunter.moveHunter();

	}

	// Map의 쥐와 헌터의 좌표값 설정
	public Map() {

		this.scanner = new Scanner(System.in);

		this.targetMouse = new Mouse(20,0);
		this.hunter = new MouseHunter(10,30);
	}

	// 쥐와 헌터의 거리 싸움
	public void playGame() {
		
		//Radar의 변수 선언
		Radar radar = new Radar();
		
		while (true) {

			System.out.println("헌터의 기본 위치" + this.hunter);

			this.targetMouse.moveMouse();
			// radar class의 distance 선언
			double distance = radar.find();
			System.out.println(radar.find());

			System.out.println(distance);
			System.out.println("x,y 좌표를 입력하세요.");
			String str = scanner.nextLine();

			String[] arr = str.split(",");

			System.out.println(Arrays.toString(arr));

			if (distance > 1) {

				System.out.println("쥐를 못잡았으니 다시 잡아보세요.");
				continue;
			
			}else if(distance <= 1){
				
				System.out.println("쥐를 잡았습니다. 게임을 종료하겠습니다.");
				break;
				
			}

		}
	}

	// main 함수 안에 Map과 Radar의 함수 출력
	public static void main(String[] args) {

		
		Map mouseMap = new Map();
		mouseMap.playGame();
		
	}

}
