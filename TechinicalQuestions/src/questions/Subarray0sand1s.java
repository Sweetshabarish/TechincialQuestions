package questions;

import java.util.Scanner;


/*
 * 1. Given an array of 0s and 1s. Write a program to find the largest sub-array (start
and end index) that has the equal number of 0s and 1s.

Examples:

Input: {1, 0, 1, 1, 1, 0, 0, 0}
Output: 0 to 7

Input: {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6

Input: {1,1,1}
Output: No sub-array found.
 */
public class Subarray0sand1s {
	
	
		
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//assigend scanner as a to read a value from the user input
		int input=scanner.nextInt();//input will read from the user as array length
		int array[]=new int[input];//creating the array to get values from the user
		for(int index=0;index<input;index++) {
			array[index]=scanner.nextInt();//storing the input values in to the array
		}
		int size=-1;      // assiging size as -1 .          
		int start = 0;
		int sum=0;
		int end = 0;
		for(int startindex=0;startindex<array.length;startindex++) {//reading the value form the array
			if(array[startindex]==0) {// the condition index value is 0 , sum stores-1
				sum=sum+(-1);
				
			}else {
				sum=sum+1;//if the condition index value is 1 ,sum store 1
			}
			for(int endindex=startindex+1;endindex<array.length;endindex++) {//inner loop of the array ,getting value from the next value of the startindex value
				if(array[endindex]==0) {
					sum+=-1;// the condition index value is 0 , sum stores-1
				}else {
					sum+=1;//f the condition index value is 1 ,sum store 1
				}
				
				if (sum == 0 && size < endindex - startindex + 1)  // if sum beacme zero example input 1 0 1 0 1 1 0 0  4:1s and 4:0s (1 as 1,0 as -1) the sum will became zero , endindex(6)-startindex(0)-1
					{ 
	                size = endindex - startindex + 1; 
	                start= startindex; // assiging the start as startindex value
	            } 
			}
			
			
		}
		end=start+size-1;
		if (size == -1) //if size became -1 return 
	        System.out.println("No subarray found"); 
	    else
	        System.out.println(start+"  "+end); 
		 
		
	}
	

}
