
public class Gugudan {
	public static void main(String[] args) {
		int i;
		int j;

		System.out.println("구구단 시작");
		System.out.println("-----------------------");

		for (i = 1; i < 10; i++) {
			System.out.println();

			for (j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println();

		}

	}

}
