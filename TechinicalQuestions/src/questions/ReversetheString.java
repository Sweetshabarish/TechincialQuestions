package questions;

import java.util.Scanner;


/*
 * 
 * 1. Write a program to reverse a given number
 */
public class ReversetheString {
	public static String Rversestring(String stringvalue) {
		  String reverse = "";
		  int length = stringvalue.length();
		  while (length > 0) {
		    reverse += stringvalue.charAt(length - 1);
		    length--;
		  }
		  return reverse;
		}
	public static void main(String[] args) {
		
		Scanner inputreader=new Scanner(System.in);//assiging the inputreader as user input
		String inputstring=inputreader.nextLine();//getting a string from the user
		
	     
		System.out.println(Rversestring(inputstring));
	}

}
