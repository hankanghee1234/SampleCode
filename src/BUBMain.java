import java.util.Scanner;

public class BUBMain 
{

	public static void main(String[] args) 
	{

		BUBItem b1 = new BUBItem("²Î");
		BUBItem b2 = new BUBItem("²Î");
		BUBItem b3 = new BUBItem("²Î");
		BUBItem b4 = new BUBItem("²Î");

		b1.next = b2;
		b2.next = b3;
		b3.next = b4;

		int idx = (int) (Math.random() * 4);

		BUBItem targetItem = b1;

		for (int i = 0; i < idx; i++) 
		{
			targetItem = targetItem.next;
		}
		targetItem.text = "´çÃ·";

		Scanner scanner = new Scanner(System.in);

		BUBItem current = b1;

		for (int i = 0; i < 4; i++) 
		{
			System.out.println("¸¶À½ÀÇ ÁØºñ¸¦ ÇÏ°í Enter");
			scanner.nextLine();
			System.out.println(current.text);
			current = current.next;
		}

	}
}