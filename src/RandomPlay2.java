import java.util.Scanner;
import java.util.Random;

public class RandomPlay2
{
   public static void main(String[] args) 
   {
      
      int wincount = 0;
      int drawcount = 0;
      int losscount = 0;
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("user = ����0,����1,��2 �� �Է��ϼ���.");
      int MY = scanner.nextInt();
      
      for(int i = 0; i < MY;i++)
      {
         int computer = (int)(Math.random()*3);
         System.out.println("computer = " + computer);

         if(computer < MY)
         {
            System.out.println("You Win");
            wincount += 1;
         }
         else if(computer > MY)
         {
            System.out.println("You Loss");
            losscount += 1;
         }
         else
         {
            System.out.println("Draw");
            drawcount += 1;
         }
         
      }
      
   }
      
}