import java.util.*;
/*It generates a random number between 0 and 100 and asks the user to guess it. The user can have at maximum 10 trials. 
If the number is guessed, the user should be asked if she/he wants to play again.
If the number is not guessed and 10 trials were used, the user is not lucky, the program should terminate with a proper message.*/

public class guessTheNumber{
	public static void main(String[] args) {
		
	int randomInteger = random.nextInt(100);
	int numberofguess = 0;

	Scanner sc = new Scanner(System.in);
	System.out.println("Can you guess the number between 0 and 100. \nDont forget that you just have 10 trials.");

	int guess = sc.nextInt();

	//boolean userWin  = true;

	do{
		if(randomInteger == guess){
			System.out.println("Wow, You gueesed the number. Do you wanna play again?");
			String play = sc.nextLine();

		if(play == yes){
				System.out.println("Welcome back. Lets play again. Enter your guess");
				int randomInteger;
				int guess;
		} 
			else
			System.out.println("So sad. Goodbye.");

		} 
		else if (randomInteger != randomInteger){ 
			numberofguess++;
			System.out.println("Try again.");
			guess = nextInt();
		}

			
	}while(numberofguess <= 10);

	}
		
}
