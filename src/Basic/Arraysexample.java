package Basic;

import java.lang.reflect.Array;

public class Arraysexample {

	public static void main(String[] args) {
		
	/*	int[] array1=new int[10];
		
		for(int i=0;i<=9;i++)
		{
			array1[i]=i;
		//	System.out.println(array1[i]);
			
		}*/
		
	/*	for(int i=0;i<=9;i++)
		{
			System.out.println(array1[i]);
		}*/
		
		//add array1 first element and array2 first element and generate array3 first element which is sum of those two first elements
		
		int[] arrayone={1,2,3,4,5};
		int[] arraytwo={6,7,8,9,10};
		
		for(int i=0;i<5;i++)
		{
			int[] arraythree=new int[5];
			
			 arraythree[i]=arrayone[i]+arraytwo[i];
			 System.out.println(arraythree[i]);
			
		}

		
		//find duplicate array
		int[] arraytest={1,2,3,1,4};
		
		//each element compare with the rest of the elements
		
		for(int i=0;i<arraytest.length;i++)//for i=0-->j=1/2/3/4 similarly for i=1-->j=1/2/3/4 etc 
		{
			for(int j=i+1;j<arraytest.length;j++)
			{
				if (arraytest[i]==arraytest[j])
				{
					System.out.println("duplicate element in the array"+" "+ arraytest[i]);
				}
			}
				
		}
	}

}
