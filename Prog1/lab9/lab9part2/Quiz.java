import java.util.ArrayList;

public class Quiz
{
	public Quiz(String filename)
	{
		this.mFilename = filename;
		mBuff = new FlashCardReader(this.mFilename);
		mFlashCards = mBuff.getFlashCards();
		play();
	}

	public void play()
	{
		for (FlashCard flashCard : mFlashCards)
		{
            System.out.println(flashCard.getQuestion());
            String userAnswer = tool.readStringFromCmd();

            if (userAnswer.equals(flashCard.getAnswer()))
                System.out.println("Right");
			else
                System.out.println("Wrong\nThe right answer was: " + flashCard.getAnswer());
        }

	}
	public static void main(String[] args)
	{
        Quiz newQuiz = new Quiz("Questions.txt");
	}
	
	private String mFilename;
	private ArrayList<FlashCard> mFlashCards;
	private FlashCardReader mBuff;
	private Toolbox tool = new Toolbox();
}
