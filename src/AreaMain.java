import java.util.Scanner;

public class AreaMain 
{
 
	public static void main(String[] args) 
	{
  
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ū ���� �������� �Է��ϼ��� : ");  
		int big = sc.nextInt();
		
		System.out.println("���� ���� �������� �Է��ϼ��� : ");
		int small = sc.nextInt();
		  
		double bigarea = Area.GetArea(big);
		double smallarea = Area.GetArea(small);
		  
		double area1 = bigarea - smallarea;
		  
		System.out.println(area1);
	  
	}

}

