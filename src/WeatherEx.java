
public class WeatherEx {
	public static void main(String[] args) {

		int[] arr = { 32, 31, 34, 36, 36, 34, 35, 36, 34, 35, 36, 36, 35, 32, 34, 35, 35, 34, 33, 35, 37, 36, 33, 33,
				32, 28, 30, 25, 27, 25, 19 };

		double sum = 0;

		for (int temp : arr) {

			sum += temp;

			System.out.println("������ ��� ���� ��: " + sum);

		}

		System.out.println("��� ���: " + sum / 31);

	}

}
