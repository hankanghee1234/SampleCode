import java.util.Scanner;
import java.util.Random;

public class RandomPlay1 
{
	public static void main(String[] args) 
	{
		 int wincount = 0;
	     int drawcount = 0;
	     int losscount = 0;
	      
	     Scanner scanner = new Scanner(System.in);
	     for (;;)
	     {
	    	 System.out.println("user = ����0,����1,��2 �� �Է��ϼ���.");
	    	 int MY = scanner.nextInt();

	         int computer = (int)(Math.random()*3);
	         System.out.println("computer = " + computer);
	            
	         if(computer < MY)
	         {
	            System.out.println("You Win");
	            wincount ++;
	         }
	         else if(computer > MY)
	         {
	            System.out.println("You Loss");
	            losscount ++;
	         }
	         else if (computer == MY)
	         {
	            System.out.println("Draw");
	            drawcount ++;   
	         }
	         
	      }
      
   }
      
}