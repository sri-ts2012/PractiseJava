package Basic;

public class Diamondincreasingpattern {

	public static void main(String[] args) {
		
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
		
		
		int n=5;
		int p=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=i;k<=n;k++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<i;j++)
			{
			System.out.print(p++ +" ");//as prints first and then incrementrs
			//	System.out.print("*");
		}
			for(int l=1;l<=i;l++)
			{
				System.out.print(p++ +" ");
			//	System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		/*int n=5;
		int p=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
			//System.out.print(p++ +" ");//as prints first and then incrementrs
				System.out.print("*");
		}
			for(int l=1;l<i;i++)
			{
				//System.out.print(p++ +" ");
				System.out.print("*");
			}
			System.out.println();
		

	}
*/
}

	}



