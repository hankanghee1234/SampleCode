import java.util.Arrays;

public class QuizPaper 
{
	Quiz[] arr;
	int idx;

	public QuizPaper(Quiz[] arr) 
	{
		super();
		this.arr = arr;
	}
	
	public Quiz getNextQuiz()
	{
		return arr[idx++];	
	}
	
}
