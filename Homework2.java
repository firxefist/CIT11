package cit111;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double planetDiameter = 1;
		int numberOfPlanets = 0;
		
		while(planetDiameter > 0) {
			
			System.out.print("Enter diameter of the planet : ");
			planetDiameter = scanner.nextDouble();
			if (planetDiameter<0) {
				break;
			}
			
			System.out.print("Enter area covered by water : ");
			double areaOfWater = scanner.nextDouble();
			
			double totalArea = 3.14159*planetDiameter*planetDiameter;
			double diameterPercent = (planetDiameter/7918)*100;
			double waterPercent = (areaOfWater/totalArea)*100;
			
			if(diameterPercent>=95 && diameterPercent<=105 && waterPercent>=10 && waterPercent<=90) {
				System.out.println("The planet is suitable for settlement");
		}
			else if(diameterPercent<=150 && waterPercent<=99) {
				System.out.println("The planet is suitable for a research station");
		}
			else {
				System.out.println("The planet is not suitable for humans");
			}
		numberOfPlanets += 1;
	}
		System.out.println("The enterprise has discovered "+numberOfPlanets+" new planets");
		scanner.close();
}
}