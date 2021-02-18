import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FlashCardReader
{
	public FlashCardReader(String filename)
	{
		this.mFilename = filename;
		try
		{
			this.mBuff = new BufferedReader(new FileReader(this.mFilename));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("File not found");
		}
	}

	public String getLine()
	{
		String line = null;

		try
		{
			line = this.mBuff.readLine();
		}
		catch (IOException e)
		{
			System.err.println("Couldn't read the line");
		}
		return (line);
	}

	public boolean fileIsReady()
	{
		try
		{
			if (mBuff != null)
				return (mBuff.ready());
			else
				return (false);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.err.println("I/O Error!");
			return (false);
		}
	}

	public ArrayList<FlashCard> getFlashCards()
	{
		ArrayList<FlashCard> flashCards = new ArrayList<>();
		try
		{
			String line = mBuff.readLine();
			while (line != null)
			{
				String[] finalFC = line.split(":");
				FlashCard flashCard = new FlashCard(finalFC[0], finalFC[1]);
				flashCards.add(flashCard);
				line = mBuff.readLine();
			}
		}
		catch (IOException e)
			{
				e.printStackTrace();
			}
		return (flashCards);
	}

	private BufferedReader mBuff;
	private String mFilename;
}
