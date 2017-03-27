package subject;

import java.util.Arrays;
import java.util.Scanner;

public class SubjectUI {

	private Scanner scanner;
	private SubjectManager manager;

	public SubjectUI() {

		this.manager = new SubjectManager();
		this.scanner = new Scanner(System.in);
	}

	public void showResult() {

		double[] arr = new double[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("");
			arr[i] = scanner.nextInt();

		}
		System.out.println(Arrays.toString(arr));

		
		this.manager.send(arr);

	}// showResult

}
