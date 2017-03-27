import java.util.Scanner;

public class BMIExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("몸무게를 입력하세요.");
		double Height = scanner.nextDouble();

		System.out.println("키를 입력하세요.");
		double Weight = scanner.nextDouble();
		//BMI 수치 계산
		double BMI = Weight / ((Height / 100) * (Height / 100));
		System.out.println(BMI);

		if (BMI < 18.5) {
			System.out.println("저체중입니다.");
		} else if (18.5 <= BMI && BMI < 25.0) {
			System.out.println("정상체중입니다.");
		} else if (25.0 <= BMI && BMI < 30.0) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("비만입니다.");
		}

	}

}
