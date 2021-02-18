import javax.lang.model.util.ElementScanner14;

public class GuessingGame{
 
	public static void main(String[] args){
		Integer numberToGuess;
		Integer guessedNumber;
 
        Toolbox myToolbox = new Toolbox();
        numberToGuess = myToolbox.getRandomInteger(10);

        System.out.println("Welcome to Guessing Game");
        guessedNumber = myToolbox.readIntegerFromCmd();
        if (guessedNumber > numberToGuess)
            System.out.println("Too high...");
        else if (guessedNumber < numberToGuess)
            System.out.println("Too low...");
        else
            System.out.println("Right number!!");
	}
 
}