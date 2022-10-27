package cit111;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Homework_4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader reader = new BufferedReader(new FileReader("map.txt"));
		
		String line;
		char character;
		int one,two,three,four,five,six,seven,eight,nine,zero;
		one=two=three=four=five=six=seven=eight=nine=zero=0;
		
		//getting the values for the ten types of thistles
		while((line = reader.readLine()) != null) {
			//it's given in the question that every line has exactly 60 letters hence i<60
			for(int i=0;i<60;i++) {
				
				character = line.charAt(i);

				switch(character) {
				case '1':
					one++;
					break;
				case '2':
					two++;
					break;
				case '3':
					three++;
					break;	
				case '4':
					four++;
					break;
				case '5':
					five++;
					break;
				case '6':
					six++;
					break;
				case '7':
					seven++;
					break;
				case '8':
					eight++;
					break;
				case '9':
					nine++;
					break;
				case '0':
					zero++;
					break;
				}
				
			
			}
		}
		int max = maxvalue(one,two,three,four,five,six,seven,eight,nine,zero);
		//printing it out as a histogram
		System.out.println("-= Histogram of Thistles in =-");
		System.out.println("-= the Hundred Acre Wood =-");
		System.out.println();
		
		while(max != 0) {
				
			System.out.print(" ");
			if(max>zero) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>one) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>two) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>three) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>four) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>five) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>six) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>seven) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>eight) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print(" ");
			}
			if(max>nine) {
				System.out.print(" ");
				System.out.print(" ");
			}
			else {
				System.out.print("o");
				System.out.print("");
			}
			
			System.out.println();
			max--;
		}
		
		System.out.println("---------------------");
		System.out.println(" 0 1 2 3 4 5 6 7 8 9");
		
		reader.close();
	}
	
	//method to find the maximum value from a set of 10 numbers
	static int maxvalue(int one,int two,int three, int four, int five, int six, int seven, int eight, int nine, int zero) {
		int i = 0;
		while(i<one||i<two||i<three||i<four||i<five||i<six||i<seven||i<eight||i<nine||i<zero) {
			i++;
		}
		return i;
	}
	
}


