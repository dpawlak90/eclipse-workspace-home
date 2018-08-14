package testConversation;

import java.util.Scanner;

public class BlackJackMain {
	
	static Scanner sc= new Scanner(System.in);	
	 static boolean afb = true;
	 static int bet = 0;
	 static int amountOfMoney = 100;
	 static boolean checkNumber = true;

	public static void main(String[] args) {
		
	askForBid();
		
	}
	
	
	public static void askForBid() {
		
		
		
		
		do {
			
			System.out.println("You're total is: $100");
		System.out.println("place your bet:");
		
		
		


	
	
	try {
		
		bet = sc.nextInt();
		
	}catch (Exception e) {
		
		sc.next();
		System.out.println("that is not a number. Try again!");
	}
	





		
		
		if(bet > 0 && bet < amountOfMoney) {
	
		System.out.println( "You're bet is " + bet + " is that correct? Y or N");
		
		String answer = sc.next();
		
	
		
		
		
		
		
		if(answer.equalsIgnoreCase("Y")) {
			
			playGame();
			
			afb = false;
		}else if(answer.equalsIgnoreCase("n")) {
			
			System.out.println( "lets try again.");
			
		}
		
		
	}else if(amountOfMoney < bet) {
		System.out.println("you dont have enough. Try again.");
	
		
	}
	
	
}while(afb);
	}
	
	
	public static void playGame() {
		System.out.println( "lets play the game! the bet is: " + bet);
	}
	
	
	
}