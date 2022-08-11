import java.util.Scanner;

public class LaunchGame {
	
	public static void main(String[] args) {
		
		Welcome wlcm = new Welcome();
		wlcm.guesserGame();
		System.out.println();
		
//		Select Normal Game or Tournament using switch concept
		System.out.println("1.NORMAL GAME--3 Players Can Play-One or Two Winner");
		System.out.println("2.TOURNAMENT--8 Players Can Play- Only One Winner");
		System.out.println();
		System.out.println("Choose 1 or 2: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		while(n!=1 && n!=2)
		{
			System.out.println("YOU HAVE ONLY 2 OPTION. CHOOSE 1 or 2:");
			n= sc.nextInt();
		}
		
		switch(n) {
		
//		Launching Normal Game
		case 1:

//			Creating object of umpire to launch game
			
			Umpire ump1 = new Umpire();
			ump1.playGame();
			
			
//			To restart game automatically if a TIE or ALL LOST
			
			while(ump1.tie  || ump1.loss)
			{
				
				Umpire tieBraker = new Umpire();
				tieBraker.playGame();
				if(!tieBraker.tie && !tieBraker.loss)
					break;
				
			}
			
			break;
			
//		Launching Tournament	
		case 2:
			
			
			Tournament finale = new Tournament();
			finale.grandFinale(1);
			
		}
		
		
		
	}

}