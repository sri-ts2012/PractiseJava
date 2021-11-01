package Basic;

public class BubbleSort {

	public static void main(String[] args) {// TODO Auto-generated method stub

		
		
	int jcounter = 0;
	int icounter = 0;
		int[] a={36,19,29,12,5};
		for(int i=0;i<a.length;i++)
		{
			
			int flag=0;int temp;
			for(int j=0;j<a.length-1-i;j++)
			{
				
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
					
					
				}
			jcounter=jcounter+1;//j run count
			
			
			if(flag==0){//outside the j for loop
				break;
				
			}
			
			
			icounter=icounter+1;
			
			}
		
		
		
		System.out.println("j is "+jcounter);
		System.out.println("i is "+icounter);
		for(int i=0;i<a.length;i++)//printing outside the outsde for loop
				{
			System.out.println(a[i]+" ");
			
			
			
				}
			
	}
	
		}

	


