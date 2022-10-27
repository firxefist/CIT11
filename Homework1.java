package cit111;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter room length : ");
		int length = scanner.nextInt();
		
		System.out.print("Enter room width : ");
		int width = scanner.nextInt();
		
		System.out.print("Enter vinyl cost per square foot : ");
		int vinylCost = scanner.nextInt();
		
		System.out.print("Enter molding cost per foot : ");
		int moldingCost = scanner.nextInt();
		System.out.println();
		
		int area,perimeter,totalCost;
		
		area = length*width;
		perimeter = 2*(length+width);
		totalCost = (area*vinylCost)+(perimeter*moldingCost);
		
		System.out.println("Area is "+area);
		System.out.println("Perimeter is "+perimeter);
		System.out.println("Cost of materials is "+totalCost);
		
		scanner.close();
	}

}
