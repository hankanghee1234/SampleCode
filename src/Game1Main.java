import java.util.Random;

public class Game1Main {
	
	public static void main(String[] args) {

		Item user = new Item(2);

		Item com = new Item(1);

		int result = user.askWin(com);

		System.out.println(result);
	}

}
