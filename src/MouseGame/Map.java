package MouseGame;


import java.util.Arrays;
import java.util.Scanner;

public class Map {

	// ���Ϳ� ���� ���� ����
	private MouseHunter hunter;
	private Mouse targetMouse;
	private Scanner scanner;
	private Radar radar;

	// ���� �����̴� ��ġ
	public void targetMouse() {
		this.scanner = new Scanner(System.in);
		this.targetMouse.moveMouse();
	}

	// ������ �����̴� ��ġ
	public void hunter() {
		this.scanner = new Scanner(System.in);
		this.hunter.moveHunter();

	}

	// Map�� ��� ������ ��ǥ�� ����
	public Map() {

		this.scanner = new Scanner(System.in);

		this.targetMouse = new Mouse(20,0);
		this.hunter = new MouseHunter(10,30);
	}

	// ��� ������ �Ÿ� �ο�
	public void playGame() {
		
		//Radar�� ���� ����
		Radar radar = new Radar();
		
		while (true) {

			System.out.println("������ �⺻ ��ġ" + this.hunter);

			this.targetMouse.moveMouse();
			// radar class�� distance ����
			double distance = radar.find();
			System.out.println(radar.find());

			System.out.println(distance);
			System.out.println("x,y ��ǥ�� �Է��ϼ���.");
			String str = scanner.nextLine();

			String[] arr = str.split(",");

			System.out.println(Arrays.toString(arr));

			if (distance > 1) {

				System.out.println("�㸦 ��������� �ٽ� ��ƺ�����.");
				continue;
			
			}else if(distance <= 1){
				
				System.out.println("�㸦 ��ҽ��ϴ�. ������ �����ϰڽ��ϴ�.");
				break;
				
			}

		}
	}

	// main �Լ� �ȿ� Map�� Radar�� �Լ� ���
	public static void main(String[] args) {

		
		Map mouseMap = new Map();
		mouseMap.playGame();
		
	}

}
