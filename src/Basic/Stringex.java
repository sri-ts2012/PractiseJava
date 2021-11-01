package Basic;

import java.util.ArrayList;

public class Stringex {
	


	public static void main(String[] args) {
//																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														there is string x=wer234;y=sdsjds3456 each time these strings are dynamically generated from the page class, even the x can start from the numbers , in the z string want to concatenate x and y and add to z after removig the numbers....																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
			//	(cannot use contains as its for static)	
		//therere is string x=wer234;y=sdsjds3456 each time these strings are dynamically generated from the page class, even the x can start from the numbers , in the z string want to concatenate x and y and add to z after removig the numbers....																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										if(																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													there is string x=wer234;y=sdsjds3456 each time these strings are dynamically generated from the page class, even the x can start from the numbers , in the z string want to concatenate x and y and add to z after removig the numbers....
		
	String z=returnZ("123abc123","456xyz456");
	System.out.println(z);
	
	String doReverse=returnReverse("I love selenium");
	System.out.println(doReverse);
	
	String doReverseWord=returnReverseWord("I love selenium");
	System.out.println(doReverseWord);
				

//System.out.println(String.join(, str1[i],str2[j]));
}
private static String returnReverseWord(String st) {
String str3="";
	
	String[] s=st.split("\\s");
	System.out.println(s.length);
	for(int i=s.length-1;i>=0;i--)
	{
		str3=str3+" "+s[i];
	}
	
	
		return str3;
	}
private static String returnReverse(String st) {
		//totoal reverse is just run the loop in reverse from str.length()-1 to i--
	
	//just reverse the last word
	String str1="";String str2="";String str3="";
	
	String[] s=st.split("\\s");
	System.out.println(s.length);
	
	
	for(int i=0;i<s.length;i++)
	{
		if(s[i].contains("selenium"))
		{
			
			str1=s[i];
			
			
		}
		else
		{
			
			str2=str2+" "+s[i];
		
		}
	
	}
	for(int i=str1.length()-1;i>=0;i--)
	{
		
		
		str3=str3+str1.charAt(i);
	}
	
	
	
		return (str2+" "+str3);
	}
/*	public String[] returnName(){
		
		ArrayList<String> list1=new ArrayList<String>();
	
		
		list1.add("BV");
		list1.add("AD");
		list1.add("FG");
		System.out.println(list1);
		System.out.println(list1.size());
		String[] str1=new String[list1.size()];
		for (int i=0;i<list1.size();i++)
		{
			str1[i] = list1.get(i); 
			
		}
		for(String k: str1)  
        {  
            System.out.println(k); // Printing array elements  
        } 
		
       
		return str1;
		 
	}
	*/
	
	public static String returnZ(String x,String y)
	{
		
		//if(x.matches("\d+"))
		x=x.replaceAll("\\d+"," ");
		x=x.trim();
		
		//if(y.matches("\\d+"))
			y=y.replaceAll("\\d+"," ");
			y=y.trim();
		
		String z=x.concat(y);
		//if(z.matches());
	
	
		
		return z;
	}
	
/*public String[] returnPrice(){
		
		ArrayList<String> list2=new ArrayList<String>();
	
		
		list2.add("CF");
		list2.add("DF");
		System.out.println(list2);
		System.out.println(list2.size());
		String[] str2=new String[list2.size()];
		for (int j=0;j<list2.size();j++)
		{
			str2[j] = list2.get(j); 
		}
		for(String k: str2)  
        {  
            System.out.println(k); // Printing array elements  
        } 
		return str2;
		 
	}
		*/
		
		
		
			
	
		}
		
	