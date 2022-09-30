package questions;

import java.util.*;

/*
 * 
 * Find the Kth largest and Kth smallest number in an array. Get the array and k as input
 */
public class KthlargestandKthsmallest
 {
   public static void main(String args[])
		{
			int Kthlarge,Kthsmall,index;//intializing kthlarge ,kthlarge and index
			int array[] = new int[]{1, 2, 3, 4, 5};//input from the user
			int number= array.length;
			Kthlarge=Kthsmall=array[0];//assiging the zeroth array in kthsmall and Kthlarge
			for(index=1;index<number;++index)//reading assigend value from the user
				{
					if(array[index]>Kthlarge)//if the present value is greater that next value
					Kthlarge=array[index];//it will store in to the Kthlarge value
		
					if(array[index]<Kthsmall)//if the present value is lower than next value and before value
						Kthsmall=array[index];//it will store in to the Kthsmall value
				}

			System.out.print("\nThe Kthsmallest element is " + Kthsmall );
			System.out.print("\nThe Kthlargest element is " + Kthlarge );
}
}