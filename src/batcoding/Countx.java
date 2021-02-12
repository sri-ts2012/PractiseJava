package batcoding;

public class Countx {

	public static void main(String[] args) {
		/*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
		countXX("abcxx") → 1
		countXX("xxx") → 2
		countXX("xxxx") → 3*/
	Countx c=new Countx();
	int n=c.countXX("abcxxxabxxx");
	System.out.println(n);
	
	
	}
		/*int countXX(String str) {
			  int count = 0;
			  for (int i = 0; i < str.length()-1; i++) //
			  {
			    if (str.substring(i, i+2).equals("xx")) count++;
			  }
			  System.out.println(count);
			  return count;
			}

			// Solution notes: the loop is shortened to end at str.length()-1
			// so we can pull out a length 2 substring without going out of bounds.
			// Remember to use equals() to compare strings, not ==.
*/		
		
		
	/*	public int countXX(String str)
		{
		int count=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
		if(arr[i]=='x'&&arr[i+1]=='x')
		count++;
		}
		System.out.println(count);
		return count;
		}
*/
	
	public  int countXX(String word) {
		if(word.length() <= 2 && !word.equals("xx")){
		return 0;
		}
		if(word.charAt(0) == 'x' && word.charAt(1) == 'x')
		{
			
		return 1 + countXX(word.substring(1)); //start index 1
		
		}
		return countXX(word.substring(1)); 
		}
}
