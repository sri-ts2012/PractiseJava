package Basic;

public class Threedimensarray {
static	int[][][] array = null;
	public static void main(String[] args) {
		
		for(int i=0;i<array.length;i++)// i=0
		{
				for(int j=0;j<array[i].length;j++)
				{//for i=0-->j=0,1,2 and for i=1 j=0,1,2
				for(int k=0;k<array[i][j].length;k++ )
				{// for i=0--->j=0 k=0,1,2,3
									//For i=0, j=1,k=01,2,3
				                                                  //        For i=0 j=2,k=0,1,2,3
				//Similrly for i=1
					array[i][j][k]=(int)(Math.random()*1000);

			System.out.println(array[i][j][k]+ " ");
				}
	System.out.println();
				}
System.out.println();


	}
	}
	

}

