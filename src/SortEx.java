import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {

		Integer[] arr = { 121, 523, 134, 645, 359 };
		// String[] arr = {"abcd","efgh","ijkl","mnop","qrst"};

		int target = 150;

		Arrays.sort(arr, (a, b) -> Math.abs(a - target) - Math.abs(b - target));
		// {
		// System.out.println(a);
		// System.out.println(b);
		// return (b - a);
		// return (target - a) - (target - b);
		// });

		System.out.println(Arrays.toString(arr));

	}

}
