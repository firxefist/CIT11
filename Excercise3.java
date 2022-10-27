package cit111;

import java.util.Scanner;

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		long firstNumber = scanner.nextLong();
		
		System.out.print("Enter Second Number : ");
		long secondNumber = scanner.nextLong();
		
		long sum;
		sum = firstNumber+secondNumber;
		long num;
		
		System.out.print("The reversed sum is ");
		
		while(sum>0) {
			num = sum % 10;
			sum /= 10;
			System.out.print(num);
		}
		scanner.close();
	}

}
