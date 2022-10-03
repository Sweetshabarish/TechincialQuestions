package questions;

import java.util.*;

/*
 * 
 * Find the Kth largest and Kth smallest number in an array. Get the array and k as input
 */
public class KthlargestandKthsmallest
 {
	
	static int kthSmallest(int A[],  int K)//finding kth smallest number 
	{
	   sort(A);//sorting the array
	   return A[K-1];
	}
    private static void sort(int[] a) {
		Arrays.sort(a);
		
	}
	static int Kthlargestt(int A[],int k,int n){//finding kth largest number
	  sortlarge(A);
	  return A[n-k];
	}
	private static void sortlarge(int A[])//sorting the number
	{
	  Arrays.sort(A);
	 int n = A.length;
        int[] temp = new int[n];

       
        for(int i = n - 1; i > -1; i--) {//reversing the array
            temp[n - i - 1] = A[i];
        }
Arrays.toString(temp);
	  
	}
public static void main(String args[])
		{
			int Kthlarge,Kthsmall,index;//intializing kthlarge ,kthlarge and index
			int array[] = new int[]{34,78,68,59,32};//input from the user
			int number= array.length;
			int kthnumber=3;
			Kthlarge=Kthsmall=array[0];//assiging the zeroth array in kthsmall and Kthlarge
			for(index=1;index<number;++index)//reading assigend value from the user
				{
					if(array[index]>Kthlarge)//if the present value is greater that next value
					Kthlarge=array[index];//it will store in to the Kthlarge value
		
					if(array[index]<Kthsmall)//if the present value is lower than next value and before value
						Kthsmall=array[index];//it will store in to the Kthsmall value
				}
    
			System.out.print("\nThe Kthsmallest element is " + Kthsmall );
			System.out.println("\nThe Kthlargest element is " + Kthlarge );
			System.out.println(kthSmallest(array,kthnumber));//display kth smallest number
			System.out.println(Kthlargestt(array,kthnumber,number));//displaying kth largest number
			
}
 }
