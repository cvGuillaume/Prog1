import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FlashCardReader
{
	public FlashCardReader(String filename)
	{
		this.mFilename = filename;
		try
		{
			mBuff = new BufferedReader(new FileReader(this.mFilename));
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
			line = mBuff.readLine();
		}
		catch (IOException e)
		{
			System.err.println("Couldn't read the line");
		}
		return (line);
	}

	public boolean fileIsReady()
	{
		boolean isReady;

		try
		{
			if (mBuff != null)
				isReady = mBuff.ready();
			else
				isReady = false;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			isReady = false;
			System.err.println("I/O Error!");
		}
		return (isReady);
	}
	private BufferedReader mBuff;
	private String mFilename;
}