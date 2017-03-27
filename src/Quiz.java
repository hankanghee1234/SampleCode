
public class Quiz 
{
	String title;
	String answer;
	String options;
	
	public Quiz(String title, String answer, String options) 
	{
		super();
		this.title = title;
		this.answer = answer;
		this.options = options;
	}
	
	public boolean checkAnswer(String userAnswer)
	{
		return this.answer.equals(userAnswer);
	}
	
	@Override
	public String toString() 
	{
		return "Quiz [title=" + title + ", answer=" + answer + ", options=" + options + "]";
	}

}
