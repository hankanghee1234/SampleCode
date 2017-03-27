package QuizGame;

public class Quiz {

	String script;
	Quiz next;
	String option;
	int answer;

	public Quiz(String script, String option, int answer) {
		super();
		this.script = script;
		this.option = option;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Quiz [script=" + script + ", next=" + next + ", option=" + option + ", answer=" + answer + "]";
	}
}