
class Tournament {
	
//	Method to use when there is a tie in Finals
    void finalRestart(int gameID,int playerOneId, int playerTwoId){
        System.out.println();
        System.out.println("Welcome to Grand Finale");

        Guesser g1=new Guesser();
        int numG1= g1.guessedNumber();

        Player p1= new Player();
        Player p2=new Player();

        int n1=p1.playerNumber();
        int n2=p2.playerNumber();

        if((numG1==n1 && numG1==n2)||(numG1!=n1 && numG1!=n2))
        {
            System.out.println("Grand Finale  has been tied, Match will Restart again.");
            finalRestart(gameID,playerOneId,playerTwoId);
        }
        if (numG1==n1 && numG1!=n2){
            System.out.println();
            System.out.println("*************************************************************************");
            System.out.println("CONGRATULATIONS....! Player "+playerOneId+" has Won The Tournament.");
            System.out.println("*************************************************************************");
            System.out.println();
            System.out.println(" Player "+playerTwoId+" is the Runner UP of The Tournament.");
            System.out.println();
            System.out.println("Tournament Ends....!");

        }
        else{
            System.out.println();
            System.out.println("*************************************************************************");
            System.out.println("CONGRATULATIONS....! Player "+playerTwoId+" has Won The Tournament.");
            System.out.println("*************************************************************************");
            System.out.println();
            System.out.println(" Player "+playerOneId+" is the Runner UP of The Tournament.");
            System.out.println();
            System.out.println("Tournament Ends....!");

        }

    }

    
    

//  Method to use when there is a tie in Semi Finals
    int semiRestart(int gameID,int playerOneId, int playerTwoId){
        System.out.println();
        System.out.println("Welcome to Semifinal "+gameID);

        Guesser g1=new Guesser();
        int numG1= g1.guessedNumber();

        Player p1= new Player();
        Player p2=new Player();

        int n1=p1.playerNumber();
        int n2=p2.playerNumber();

        if((numG1==n1 && numG1==n2)||(numG1!=n1 && numG1!=n2))
        {
            System.out.println("Semifinal "+gameID+" has been tied, Match will Restart again.");
            semiRestart(gameID,playerOneId,playerTwoId);
        }

        if(numG1==n1 && numG1!=n2){
            System.out.println("Player "+playerOneId+" won, move to GRAND FINALE");
            System.out.println();
            return playerOneId;
        }
        else {
            System.out.println("Player "+playerTwoId+" won, move to GRAND FINALE");
            System.out.println();
            return playerTwoId;

        }


    }
    
    

//    Method to play match
    public int match(int matchID) {
        System.out.println("Welcome to match " + matchID + " of the tournament");
        System.out.println("Match " + matchID + ": " + "Player " + ((matchID*2)-1) + " vs Player " + (matchID * 2));

        Guesser guess01 = new Guesser();
        int numFromguesser = guess01.guessedNumber();
        Player p1 = new Player();
        Player p2 = new Player();
        int n1 = p1.playerNumber();
        int n2 = p2.playerNumber();

        if ((numFromguesser == n1 && numFromguesser == n2) || (numFromguesser != n1 && numFromguesser != n2))
        {
            System.out.println("Match Tied, Match will start again.");
            return match(matchID);
        }

        if (numFromguesser == n1 && numFromguesser!=n2)
        {
            System.out.println("Result of Match " + matchID + ": Player " + ((matchID*2)-1) + " has won the match and moves to Semifinal.");
            System.out.println();
            return ((matchID*2)-1);

        }
        else
        {
            System.out.println("Result of Match " + matchID + ": Player " + (matchID * 2) + " has won the match and moves to Semifinal.");
            System.out.println();
            return matchID*2;

        }

    }








    int semiFinals(int semifinalID) {

        int m1=match(((semifinalID*2)-1));
        int m2=match(((semifinalID*2)));


        System.out.println();
        System.out.println("Welcome to Semifinal "+semifinalID);
        System.out.println("Semi Final "+semifinalID+": Player "+m1 +" vs Player "+ m2);


        Guesser guesser01 = new Guesser();
        int numFromGuessor01 = guesser01.guessedNumber();

        Player p01 = new Player();
        Player p02 = new Player();

        int n01 = p01.playerNumber();
        int n02 = p02.playerNumber();

        if((numFromGuessor01==n01 && numFromGuessor01==n02) || (numFromGuessor01!=n01 && numFromGuessor01!=n02))
        {
            System.out.println("Semifinal "+semifinalID+" has been tied, Match will Restart again.");
            System.out.println();
            System.out.println("Semi Final "+semifinalID+": Player "+m1 +" vs Player "+ m2);
            return semiRestart(semifinalID,m1,m2);
        }

        if ((numFromGuessor01 == n01 && numFromGuessor01!=n02)){

            System.out.println("Player "+m1+" won, move to GRAND FINALE");
            System.out.println();
            return m1;
        }
        else
        {
            System.out.println("Player "+m2+" won, move to GRAND FINALE");
            System.out.println();
            return m2;
        }


    }

    void grandFinale(int finalId){
        int finalPlayer01 = semiFinals(((finalId*2)-1));
        int finalPlayer02 = semiFinals((finalId*2));

        System.out.println();
        System.out.println("Welcome to Grand Finale");
        System.out.println("Grand Finale : Player "+finalPlayer01 +" vs Player "+ finalPlayer02);



        Guesser guesser01 = new Guesser();
        int numFromGuessor01 = guesser01.guessedNumber();

        Player p01 = new Player();
        Player p02 = new Player();

        int n01 = p01.playerNumber();
        int n02 = p02.playerNumber();

        if((numFromGuessor01==n01 && numFromGuessor01==n02) || (numFromGuessor01!=n01 && numFromGuessor01!=n02))
        {
            System.out.println("Grand Finale  has been tied, Match will Restart again.");
            System.out.println("Grand Finale : Player "+finalPlayer01 +" vs Player "+ finalPlayer02);
            finalRestart(finalId,finalPlayer01,finalPlayer02);
        }

        if (numFromGuessor01 == n01 && numFromGuessor01!=n02){
            System.out.println();
            System.out.println("*************************************************************************");
            System.out.println("CONGRATULATIONS....! Player "+finalPlayer01+" has Won The Tournament.");
            System.out.println("*************************************************************************");
            System.out.println();
            System.out.println(" Player "+finalPlayer02+" is the Runner UP of The Tournament.");
            System.out.println();
            System.out.println("Tournament Ends....!");

        }
        else
        {
            System.out.println();
            System.out.println("*************************************************************************");
            System.out.println("CONGRATULATIONS....! Player "+finalPlayer02+" has Won The Tournament.");
            System.out.println("*************************************************************************");
            System.out.println();
            System.out.println(" Player "+finalPlayer01+" is the Runner UP of The Tournament.");
            System.out.println();
            System.out.println("Tournament Ends....!");

        }




    }

}