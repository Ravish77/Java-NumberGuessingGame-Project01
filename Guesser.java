import java.util.Scanner;

 class Guesser {
	 
	 int guessNum;
		
	 int guessedNumber(){
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Guesser , Please Guess the Number from 0-9: ");
			guessNum = sc.nextInt();
			while(guessNum<0 || guessNum>9)
			{
				System.out.println("Number should be in the range from 0-9, please enter a Number again:");
				guessNum=sc.nextInt();
			}
			
				return guessNum; 
			
		}

}