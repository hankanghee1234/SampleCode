import java.util.Arrays;

public class KNNTest {

	public static void main(String[] args) {
		// IQ, EQ, 이과/문과 를 배열로 생성
		String[][] arr = { { "67", "45", "S" }, { "68", "49", "S" }, { "65", "80", "H" }, { "90", "65", "S" },
				{ "48", "72", "H" } };
		// 타켓으로 잡음
		String[] target = { "64", "43", "" };

		// 람다식을 이용한 배열의 정렬
		Arrays.sort(arr, (a, b) -> {

			double distanceA = DistanceUtil.calcStr(a[0], target[0], a[1], target[1]);
			double distanceB = DistanceUtil.calcStr(b[0], target[0], b[1], target[1]);

			double gap = distanceA - distanceB;

			if (gap > 0) {
				return 1;
			} else if (gap < 0) {
				return -1;
			} else {
				return 0;
			}

		});

		for (String[] subArr : arr) {
			System.out.println(Arrays.toString(subArr));
		}

	}

}