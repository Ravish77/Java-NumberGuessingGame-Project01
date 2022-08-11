
class Umpire {
	
	Guesser guess = new Guesser();
	int numberFromGuesser = guess.guessedNumber();
	
	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();
	
	int numberFromPlayer1 = player1.playerNumberforNormalGame(1);
	int numberFromPlayer2 = player2.playerNumberforNormalGame(2);
	int numberFromPlayer3 = player3.playerNumberforNormalGame(3);
	
//	Using Primitive Data type Boolean
	boolean tie=numberFromGuesser==numberFromPlayer1 && numberFromGuesser==numberFromPlayer2 && numberFromGuesser==numberFromPlayer3;
	boolean loss = numberFromGuesser!=numberFromPlayer1 && numberFromGuesser!=numberFromPlayer2 && numberFromGuesser!=numberFromPlayer3;
	
	void playGame() {
		
		if(numberFromGuesser==numberFromPlayer1)
		{
			if(numberFromGuesser==numberFromPlayer2 && numberFromGuesser==numberFromPlayer3)
			{
				System.out.println("Match Tied, Play again to Select Winner.");
			}
			else if(numberFromGuesser==numberFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 are the winners");
			}
			else if(numberFromGuesser==numberFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 are the winners");
			}
			else
			{
				System.out.println("Player 1 is winner");
			}
		}
		
		else if(numberFromGuesser==numberFromPlayer2)
		{
			if(numberFromGuesser==numberFromPlayer3)
			{
				System.out.println("Player 2 and Player 3 are the winners");
			}
			else
			{
				System.out.println("Player 2 is the winner");
			}
		}
		
		else if(numberFromGuesser==numberFromPlayer3)
		{
			System.out.println("Player 3 is the winner");
		}
		
		else
		{
			System.out.println("All lost game, Try again...!");
			
		}
		
	}
	

}