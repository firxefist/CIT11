package cit111;

import java.util.Random;
import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int computerGuess = random.nextInt(1024);
		
		System.out.print("Enter First Guess : ");
		int yourGuess = scanner.nextInt();
		
		int tries = 1;
		
		while(yourGuess!=computerGuess) {
			if(yourGuess>computerGuess) {
				System.out.print("Too large, try again : ");
				yourGuess = scanner.nextInt();
				tries+=1;
			}
			else {
				System.out.print("Too small, try again : ");
				yourGuess = scanner.nextInt();
				tries+=1;
			}
		}
		System.out.println("Correct! It took you "+tries+" guesses");	
		scanner.close();
	}

}
