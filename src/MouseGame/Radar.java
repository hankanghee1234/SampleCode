package MouseGame;

public class Radar {
	Mouse targetMouse;
	MouseHunter hunter;
	double distance = 0;

	public double find() {

		// ���� ������ ��ġ ����
		// ���� �ʱⰪ ����
		targetMouse = new Mouse(50, 50);

		// ������ �ʱⰪ ����
		hunter = new MouseHunter(50, 0);
		
		// ���Ϳ� �� ������ �Ÿ��� ����
		distance = Math.sqrt(Math.pow(hunter.getXpos() - targetMouse.getYpos(), 2)
				+ Math.pow(hunter.getYpos() - targetMouse.getYpos(), 2));

		return distance;
	}
}
