package batcoding;

public class Stringsexamples {

	public static void main(String[] args) {
		String s1="Bindu";//1 object
		String s2=new String("Hima");//2 objects
		StringBuffer s3=new StringBuffer("Bindu");//mutable
		
		String s4=new String(s3);//immutable
		System.out.println(s4);
		
		byte[] b={101,102,103};
		String s5=new String(b);
		System.out.println(s5);
		
		char[] c={'a','b','c'};
		String s6=new String(c);
		System.out.println(s6);
		
	}

}
