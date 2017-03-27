import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class QuizMain 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		Quiz[] array = new Quiz[10];
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = new Quiz("Quiz" + i,"3","����1 ����2");
		}
		
		QuizPaper paper = new QuizPaper(array);
		
		//System.out.println(Arrays.toString(array));
		
		while(true)
		{
			System.out.println("시작");
			scanner.nextLine();
			
			Quiz quiz = paper.getNextQuiz();
			
			System.out.println(quiz.title);
			System.out.println(quiz.options);
			
			String user = scanner.nextLine();
			
			if(quiz.checkAnswer(user) == false)
			{
				System.out.println("Back Home!!!");
				break;
			}
		}
		
	}
}
