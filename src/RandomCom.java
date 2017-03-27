import java.util.Scanner;

public class RandomCom 
{
	public static void main(String[] args) 
	{
		int start = 0;
		int end = 100;
		
		for (;;)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자 하나를 생각하세요");
			int num = scanner.nextInt();
			
			int mid = (start+end)/2;

			while(num>2)
			{
				++num;
			}
			System.out.println("당신이 생각하는 숫자는" + mid +"입니까?" );
			System.out.println("높으면 0, 낮으면 1, 맞으면 2룰 입력하세요.");
			
			if(num>=2)
			{
				System.out.println("맞습니다.");
				break;
			}
			else if(num>=1)
			{
				start=mid;
			}
			else if(num>=0)
			{
				end=mid;
			}
		}
	}
}	
	

