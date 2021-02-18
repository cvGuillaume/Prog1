public class FlashCard
{
	public FlashCard(String q, String a)
	{
		this.mAnswer = a;
		this.mQuestion = q;
	}

	public String getAnswer()
	{
		return (this.mAnswer);
	}

	public String getQuestion()
	{
		return (this.mQuestion);
	}
	private String mQuestion;
	private String mAnswer;
}