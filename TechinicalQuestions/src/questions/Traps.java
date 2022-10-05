package questions;

import java.util.Scanner;

public class Traps  
{  
	/*
	 * checking first two condition
	 */
	static boolean checkingfirstandsecondcondition(int x,int y) {
		if(x==y) {
			//System.out.println(x);
			return true;
			//y=y+2;
			
		}else if (x%y==0 || y%x==0){
	//System.out.println(x);
			//y=y+2;
			return true;
			
		}
		return false;
	}
		
	
	static void  trapchecking(int n1,int n2,int y) {
		boolean flag = false;
		for(int x=n1;x<=n2;x++) {
//			System.out.println(x+" "+y);
			if(checkingfirstandsecondcondition(x,y)==false) {
				if(checkingthirdcondition(x,y)==false) {
					y=y-1;
				}else {
					y=y+2;
					flag=true;
					System.out.println(x);
				}
			}else {
				y=y+2;
				flag=true;
				System.out.println(x);
			}
			if(y<3) {
				y=3;
			}
		      
			}
		if(flag==false) {
			System.out.println("none");
		}
		}
	/*
	 *  checking last condition
	 */
		static boolean checkingthirdcondition(int x,int y) {    
		      while(true) {
//		    	  System.out.println(x+" "+y);
		    	  	if(checkingfirstandsecondcondition(x,y)==true) {
		    			 return true;
		    		}
		    	  	else if(x<10)
		    	  		break;
		    		 
	    	  else {
	    		  x=sumofdigit(x);
	    	  }
		    		 
		      }
		      return false;
		      
		      
			}
			
		
		
/*
 * finding sum of the digit
 */
	static int sumofdigit(int number)  
	{  
	      
	int sum;      
	
	for (sum = 0; number > 0; sum = sum + number % 10, number = number / 10);  
	
	return sum;  
	}  
	
	
	/*
	 * main method
	 */
 public static void main(String[] args) {
	Scanner inputreader=new Scanner(System.in);
	int n1=inputreader.nextInt();
	int n2=inputreader.nextInt();
	int y=inputreader.nextInt();
	trapchecking(n1,n2,y);
	}

}  
