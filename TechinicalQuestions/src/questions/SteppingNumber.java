package questions;

import java.util.Scanner;




public class SteppingNumber {
	
	
	public static boolean Steppingnumber(int number)//(number is receiving number from the disolayingsteppingnumber)
	{
	    
	    int PreviousDigit = -1;//intializing previous digit has -1

	   
	    while (number > 0)//checking difference between adjancent values and finding difference between them
	    {
	        
	        int CurrentDigit = number % 10;//getting current digit of the number

	        
	        if (PreviousDigit != -1)//one digit number is considering has a stepping number
	        {
	            
	            if (Math.abs(CurrentDigit-PreviousDigit) != 1)//going to check ,wheather previous value and current value difference is 1
	                return false;
	        }
	        number /= 10;
	        PreviousDigit = CurrentDigit;
	    }
	    return true;
	}

	
	public static void DisplayingSteppingNumbers(int startnumber,int endnumber)//receiving 2 inputs from main method though the user
	{
	    
	    for (int i = startnumber; i <= endnumber; i++)//iterating number from first to last
	        if (Steppingnumber(i))//checking wheather given number is stepping number 
	            System.out.print(i+ " ");//displaying
	}
	
	
	public static void main(String[] args) {
		Scanner inputreader = new Scanner(System.in);
		int startnumber=inputreader.nextInt();//reading input1 from the user
		int endnumber=inputreader.nextInt();//reading input2 from the user
		
		  DisplayingSteppingNumbers(startnumber,endnumber);//passing value to the method
		    
		    }
		}
	


