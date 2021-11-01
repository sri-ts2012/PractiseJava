package strings;

public class CaptialFormatter {
	
	
	public static void main(String[] args)
	{
		CaptialFormatter cf=new CaptialFormatter();
	String capWord=	cf.capitalFormat("my name is" );
	System.out.println(capWord);
		
	}
	
	public String capitalFormat(String sent)
	{
		String capitalizedWord = "";
		
		
		String words[]=sent.split("\\s");
	for(String w:words)
			
		
		{
			String first=w.substring(0,1);//only the zero index is considered as end index is 1 so 1-1 is taken which is 0 again
			String afterFirst=w.substring(1);
			capitalizedWord =capitalizedWord +first.toUpperCase()+afterFirst+" ";
			
			
		}
		
		/*for(int i=0;i<words.length;i++)
		{
			String fword=words[i].substring(0,1);
			}
		*/	
		
		
		
		
		return capitalizedWord.trim();
		
	}

}
