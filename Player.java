import java.util.Scanner;

class Player {
int playerNum;
	
	int playerNumber(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Player  , Please Guess the Number , You have only 1 chance. (Hint:it lies between 0-9)");
		playerNum = sc.nextInt();
		
		if(playerNum<0 || playerNum>9)
		{
			System.out.println("Player ,Sorry! You Have Lost. Better Luck Next Time---YOU WILL GET ONE MORE CHANCE IF ALL LOST ");
			
		}
		
		return playerNum;
		
	}
	
	int playerNumberforNormalGame(int playID){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Player " +playID+", Please Guess the Number , You have only 1 chance. (Hint:it lies between 0-9)");
		playerNum = sc.nextInt();
		
		if(playerNum<0 || playerNum>9)
		{
			System.out.println("Player "+playID+", Sorry! You Have Lost. Better Luck Next Time---YOU WILL GET ONE MORE CHANCE IF ALL LOST ");
			
		}
		
		return playerNum;
	}
}