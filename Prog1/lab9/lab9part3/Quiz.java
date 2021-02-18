import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Quiz
{
	public Quiz(String filename)
	{
		this.mFilename = filename;
		mBuff = new FlashCardReader(this.mFilename);
		mFlashCards = mBuff.getFlashCards();
		nbrQ = mFlashCards.size();
		play();
	}

	public void play()
	{
		String userAnswer = null;
        boolean acceptableAnswer = false;
		while (!acceptableAnswer)
		{
            System.out.println("Would you like to save your results?");
            userAnswer = tool.readStringFromCmd();
            if (userAnswer.equalsIgnoreCase("Y") || userAnswer.equalsIgnoreCase("N"))
                acceptableAnswer = true;
        }

		if (userAnswer.equals("Y"))
		{
			try
			{
                writer = new PrintStream(new FileOutputStream("save.txt"));
			}
			catch (FileNotFoundException e)
			{
                e.printStackTrace();
                System.err.println("Sorry, something went wrong.");
            }
			for (FlashCard flashCard : mFlashCards)
			{
	            System.out.println(flashCard.getQuestion());
	            userAnswer = tool.readStringFromCmd();
				if (userAnswer.equals(flashCard.getAnswer()))
				{
					System.out.println("Right");
					save(flashCard.getQuestion() + "," +flashCard.getAnswer() + ",right");
					score++;
				}
				else
				{
					System.out.println("Wrong\nThe right answer was: " + flashCard.getAnswer());
					save(flashCard.getQuestion() + "," +flashCard.getAnswer() + ",wrong");
				}
				nbrQ++;
			}
			writer.print(score);
			writer.print(',');
			writer.print(nbrQ);
			writer.print(',');
			writer.print(getScorePercentage());
		}
		else if (userAnswer.equals("N"))
		{
			for (FlashCard flashCard : mFlashCards)
			{
	            System.out.println(flashCard.getQuestion());
	            userAnswer = tool.readStringFromCmd();
				if (userAnswer.equals(flashCard.getAnswer()))
				{
					System.out.println("Right");
					save(flashCard.getQuestion() + "," +flashCard.getAnswer() + ",right");
				}
				else
				{
					System.out.println("Wrong\nThe right answer was: " + flashCard.getAnswer());
					save(flashCard.getQuestion() + "," +flashCard.getAnswer() + ",wrong");
				}
			}
		}
	}

	public double getScorePercentage()
	{
        return ((double) score / nbrQ) * 100;
    }

	public void save(String line)
	{
		writer.println(line);
	}
	public static void main(String[] args)
	{
        Quiz newQuiz = new Quiz("Questions.txt");
	}
	
	private String					mFilename;
	private ArrayList<FlashCard>	mFlashCards;
	private FlashCardReader 		mBuff;
	private Toolbox					tool = new Toolbox();
	private PrintStream				writer;
	private int						score;
	private int						nbrQ;
}
