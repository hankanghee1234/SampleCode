
public class AutoIncrement {
	public static void main(String[] args) {
		int i;

		outer: for (i = 0; i < 10; i++) {
			inner: for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if (j == 5) {
					break outer;
				}
			}

		}

	}

}
