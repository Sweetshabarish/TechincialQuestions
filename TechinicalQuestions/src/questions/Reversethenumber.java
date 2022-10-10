package questions;

import java.util.Scanner;

public class Reversethenumber {
	public static void Rversenumber(int number) {

        if (number <= 0) {//if the number contains less than zero means it will return present number
            
            Rversenumber(number );
        } else if (number < 10) {//if number less than 10 means it will return single digigt number
            System.out.println(number);
        }
        else {
            System.out.print(number % 10);//printing number in the reverse module
            Rversenumber(number / 10);
        }
    }
	public static void main(String[] args) {
		
		Scanner inputreader=new Scanner(System.in);//assiging the inputreader as user input
		int inputnumber=10000;//getting a number as a string from the user
		
	     
		Rversenumber(inputnumber);//sending the input number to the Reverse number method
	}

}
