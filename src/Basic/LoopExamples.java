package Basic;

import java.util.Scanner;

public class LoopExamples {

	public static void main(String[] args) {
		
		System.out.println("enter the table you want ");
		Scanner n=new Scanner(System.in);
		int t=n.nextInt();
		
		/*int i=1;
		while(i<=10)
		{
			int r=t*i;
			System.out.println(t+"*"+i+"="+r);
			i++;
		}
		*/
		for(int i=1;i<=10;i++)
		{
			int r=t*i;
			System.out.println(t+"*"+i+"="+r);
			
		}

	}

}
