import java.util.Scanner;

public class AreaMain 
{
 
	public static void main(String[] args) 
	{
  
		Scanner sc = new Scanner (System.in);
		
		System.out.println("큰 원의 반지름을 입력하세요 : ");  
		int big = sc.nextInt();
		
		System.out.println("작은 원의 반지름을 입력하세요 : ");
		int small = sc.nextInt();
		  
		double bigarea = Area.GetArea(big);
		double smallarea = Area.GetArea(small);
		  
		double area1 = bigarea - smallarea;
		  
		System.out.println(area1);
	  
	}

}

