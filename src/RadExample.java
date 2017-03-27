import java.util.Scanner;

public class RadExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("����� Ű�� �Է��ϼ���.");
		double HumanHeight = scanner.nextInt();

		System.out.println("�������� �Ÿ��� �Է��ϼ���");
		double Distance = scanner.nextInt();

		System.out.println("������ ����ϼ���.");
		double Degree = scanner.nextInt();

		double result = HumanHeight + (Distance * Math.tan(Degree));
		System.out.println(result);

	}

}
