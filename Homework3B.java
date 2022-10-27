package cit111;

import java.util.Scanner;

public class Homework3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter table size : ");
		int tableSize = scanner.nextInt();
		System.out.print("Enter squaree size : ");
		int squareSize = scanner.nextInt();
		
		
		for(int a=0;a<tableSize;a++) {
			System.out.println();
			for(int i=0;i<tableSize;i++) {
				for(int j=0;j<squareSize;j++) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
			for(int i=0;i<(squareSize-2);i++) {
				for(int j=0;j<tableSize;j++) {
					System.out.print("*");
					for(int k=0;k<(squareSize-2);k++) {
						System.out.print("o");
					}
					System.out.print("*");
					System.out.print(" ");
				}
				System.out.println();
			}
			for(int i=0;i<tableSize;i++) {
				for(int j=0;j<squareSize;j++) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
