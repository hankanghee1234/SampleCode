package MouseGame;

public class Radar {
	Mouse targetMouse;
	MouseHunter hunter;
	double distance = 0;

	public double find() {

		// 임의 값으로 위치 지정
		// 쥐의 초기값 설정
		targetMouse = new Mouse(50, 50);

		// 헌터의 초기값 설정
		hunter = new MouseHunter(50, 0);
		
		// 헌터와 쥐 사이의 거리간 측정
		distance = Math.sqrt(Math.pow(hunter.getXpos() - targetMouse.getYpos(), 2)
				+ Math.pow(hunter.getYpos() - targetMouse.getYpos(), 2));

		return distance;
	}
}
