package questions;

import java.util.Scanner;

public class Reversethenumber {
	public static String Rversenumber(String stringvalue) {
		  String reversenumber = "";
		  int length = stringvalue.length();
		  while (length > 0) {
		    reversenumber += stringvalue.charAt(length - 1);
		    length--;
		  }
		  return reversenumber;
		}
	public static void main(String[] args) {
		
		Scanner inputreader=new Scanner(System.in);//assiging the inputreader as user input
		String inputstring=inputreader.nextLine();//getting a number as a string from the user
		
	     
		System.out.println(Rversenumber(inputstring));
	}

}
