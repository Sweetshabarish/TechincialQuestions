package questions;

import java.util.ArrayList;
import java.util.Scanner;

/*
*2. Write a program to print the repeating substring of minimum length 2 in a given sentence.

Examples:

Input: However Everyday is a Day.
Output: ever, day

Note: Not case sensitive. Substrings need to be identified irrespetive of upper case or 
lower case.

Input: Happy Holi!
Output: none
*
*/
public class Findingsubsting {
	

	    public static void main(String[] args) {

	        String input = "However Everyday is a Day.";//getting input from the user
	        input = input.toLowerCase();//converting into lower case
	        String[] Arraywords = input.split(" ");//splitting the words 
	        String answer = "";//creating dummy variable to store the answer

	        for(int index=0;index<Arraywords.length;index++)
	        {
	            String stringword= Arraywords[index];//storing one by one word to check
	        
	            for(int innerindex=0;innerindex<stringword.length();innerindex++){

	                for(int insideinnerindex=stringword.length();insideinnerindex>innerindex;insideinnerindex--){

	                    String checker = stringword.substring(innerindex, insideinnerindex);//creating checker to optimize the code
	                    if(substringChecker(checker,Arraywords,index) == 1)//sending value to the method and checking the condition
	                    {
	                        if(answer.contains(checker) == false && checker.length() >= 2)//if did't contains and greater than 2
	                        {
	                            answer += checker + " ";//it store into answer
	                        }
	                        break;
	                    }
	                }
	            }
	        }
	        System.out.println(answer);//displaying the answer
	    }

	    static int substringChecker(String str, String[] input,int index)
	    {
	        int count=0;
	        for(int i=0;i<input.length;i++)
	        {
	            count = 0;
	            if(input[i].contains(str) && i != index && str.equals(" ") == false)//if the word contains in given string and if it equals to space
	            {
	                // System.out.println(input[i]+" "+i+" " + str +" "+index);
	                return 1;
	            }
	        }
	        if(count > 1) { System.out.println(count);} 
	        return count;
	    }

	}

