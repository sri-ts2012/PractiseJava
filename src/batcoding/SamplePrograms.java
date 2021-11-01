package batcoding;

public class SamplePrograms {

	public static void main(String[] args) {
		
		SamplePrograms  sp=new SamplePrograms();
		
		int c=sp.max1020(10, 21);
		System.out.println(c);
	}
	
	
	  

public int max1020(int a, int b) {
	  // First make it so the bigger value is in a
	  if (b > a) {
	    int temp = a;
	    a = b;
	    b = temp;
	  }
	  
	  // Knowing a is bigger, just check a first
	  if (a >= 10 && a <= 20) return a;
	  if (b >= 10 && b <= 20) return b;
	  return 0;
	}
}