package Basic;

import java.util.Scanner;

public class Otpgeneration {

	public static void main(String[] args) {
		
	//	@SuppressWarnings("unused")
	//	Scanner s=new Scanner(System.in);
		//s.nextInt();
		
		/*int otp=(int)(Math.random()*10000);
		System.out.println(otp);//shd be 4 digit not less not more
*/		
		int[] arrayotp=new int[3];
		for (int i=0;i<3;i++)
		{
			 arrayotp[i]=(int)(Math.random()*9000)+1000;
			 //math.random generates from 0.0 and less than 1.0 so output will be less than 10000
			 
			
			
		System.out.println(arrayotp[i]);
			
		
		}
		
		
	}
		
		
	
			
		
		
	}


