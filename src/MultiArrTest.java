
public class MultiArrTest {
	public static void main(String[] args) {
		int[][] arr = new int[5][];

		arr[0] = new int[] { 1 };
		arr[1] = new int[] { 2, 3 };
		arr[2] = new int[] { 4, 5, 6 };
		arr[3] = new int[] { 7, 8, 9, 10 };
		arr[4] = new int[] { 11, 12, 13, 14, 15 };
		arr[5] = new int[] { 17, 18, 19, 20, 21, 22 };

		// int[] a1 = {1,2,3,4,5};
		//
		// arr[0] = a1;
		//
		// a1[1] = 100;

		System.out.println(arr[1][2]);
		// System.out.println(a1[1]);

	}

}
