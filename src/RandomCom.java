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
			System.out.println("���� �ϳ��� �����ϼ���");
			int num = scanner.nextInt();
			
			int mid = (start+end)/2;

			while(num>2)
			{
				++num;
			}
			System.out.println("����� �����ϴ� ���ڴ�" + mid +"�Դϱ�?" );
			System.out.println("������ 0, ������ 1, ������ 2�� �Է��ϼ���.");
			
			if(num>=2)
			{
				System.out.println("�½��ϴ�.");
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
	

