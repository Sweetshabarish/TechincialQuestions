package questions;

import java.util.Arrays;

import java.util.Scanner;

/*
 * 2. Write a program to traverse an array from left to right and replace each number with the next greater number present within the remaining elements from its position. For example, from (4, 9, 23, 7) the next greater number to 4 is 7. If no such number is found, then replace the remaining array elements with -1.

Examples:

Input: 2, 5, 7
Output: 5, 7, -1

Input: 2, 4, 8, 90, 77, 54
Output: 4, 8, 54, -1, -1, -1

Input: 2, -1, 0, -1, 3
Output: 3, 0, 3, 3, -1
 */

public class TraverseFromRighttoLeft {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);// Assiging the scanner as input reader from the user name
	        String[] stringlength= scanner.nextLine().split(" ");//stringlength which read and store the input from the user
	        int[] array= new int[stringlength.length];//length of the string
	        for(int i=0;i<array.length;i++){// loop to store the values in array
	            array[i] = Integer.parseInt(stringlength[i]);
	        }
	        int[] result = new int[array.length];//creating empty array which as same length of the given array
	        for(int index=0;index<array.length;index++){//reading the values  from the array
	            int maxvalue = Integer.MIN_VALUE;//assiging min value to the mxavalue ,because when we take value from the array,need to check the value wheathre is greater than before vale and lesser than next value
	            
	            int current = array[index];///assiging present index value in the current variable
	            for(int innerindex=index+1;innerindex<array.length;innerindex++){//reading the value from the array
	                if(array[innerindex]>current && maxvalue==Integer.MIN_VALUE)//checking the condition ,whether the array value is greater than present value 
	                    maxvalue= array[innerindex];//if condition true means index value stored in maxvalue
	                if(maxvalue!=Integer.MIN_VALUE && array[innerindex]<maxvalue && !(array[innerindex]<=current))//if the maxvalue is not equal and it should be less than maxvalue ,it should be not equal to current value
	                    //example 2, 4, 8, 90, 77, 54 ::::: 2 is overidded by 4, 4 is by 8, 8 by 54 , 90,77,2 are ,greater 90 no values are there and before is lesser than 90 + it is not equal current value
	                	maxvalue = array[innerindex];
	            }
	            if(maxvalue == Integer.MIN_VALUE)//the condition maxvalue is equal to minvalue
	                result[index] = -1;//return -1
	            else
	                result[index] = maxvalue;//else value will be overrided to the current inndex
	        }

	        System.out.println(Arrays.toString(result));//print the array in string format
	    }

}
