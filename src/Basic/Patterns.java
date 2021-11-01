package Basic;

public class Patterns {

	public static void main(String[] args) {
		
	/*	
		*
		**
		***
		****
		*****
		
		*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();	
		}
	
	
	//pattern 2
		System.out.println("next pattern");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
		
		System.out.println();	
		}
	
	/*
		**
		***
		****
		*****
		next pattern
		*****
		****
		***
		**
		*
	*/
	
	System.out.println("thrid pattern");
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
	
	System.out.println();	
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
	
	System.out.println();	
	}
	
	System.out.println("fourth pattern");
/*	fourth pattern
    *
   **
  ***
 ****
*****
*/
	for(int i=1;i<=5;i++)
	{
		for(int k=4;k>=i;k--)
		{
			System.out.print(" ");
		}
		
			for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		
	System.out.println();	
	}
	
	System.out.println("fifth pattern");
	
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=i-1;k++)
		{
			System.out.print(" ");
		}

		for(int j=5;j>=i;j--)
	{
		System.out.print("*");
	}
		
		
	System.out.println();	
	}
	
	
	//pyramid with spaces in between pattern-1stway
	for(int i=1;i<=5;i++)
	{
		for(int k=4;k>=i;k--)
		{
			System.out.print(" ");
		}
		
			for(int j=1;j<=i;j++)
		{
			System.out.print(" *");
		}
		
	System.out.println();	
	}
	
System.out.println("pyramid pattern	2ndway");
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=1;j--)
		{
			if(j>i)
			{
				System.out.print(" ");
				
			}
			else
			{
				System.out.print(" *");
			}
		}
		System.out.println();
	}
	
	//pyramid of pattern without spaces
	
	
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		for(int l=2;i<=i;l++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
	
	}

