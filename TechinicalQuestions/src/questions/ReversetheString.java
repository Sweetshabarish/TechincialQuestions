package questions;

import java.util.Scanner;


/*
 * 
 * 1. Write a program to reverse a given number
 */
public class ReversetheString {
	public static void main(String[] args) {
		
		Scanner inputreader=new Scanner(System.in);//assiging the inputreader as user input
		String inputstring=inputreader.next();//geting value from the user
		String reversestring="";//creating dummy string ,to store the reverse value
		for(int index=inputstring.length()-1;index>=0;index--) {//using for loop in reverse manner
			reversestring+=inputstring.charAt(index);//storing the single character in reverse manner in the reverse string
		}
		System.out.println(reversestring);// displaying the character
	}

}
