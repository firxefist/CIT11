package cit111;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Length of the room : ");
		int length = scanner.nextInt();
		
		System.out.print("Enter the The Width of the room : ");
		int width = scanner.nextInt();
		
		System.out.print("Enter the Number Of Students : ");
		int numberOfstudents = scanner.nextInt();
		
		int area,check;
		area = length * width;
		check = area/numberOfstudents;
		
		if(check>10) {
			int remaining = area-(numberOfstudents*10);
			System.out.println("Room is too large by "+remaining+" Square feet");
		}
		else if(check==10 ) {
			System.out.println("Room size is just right");
		}
		else {
			int remaining = (numberOfstudents*10)-area;
			System.out.println("Room is too small by "+remaining+" Square feet");;
		}
		scanner.close();
	}

}
