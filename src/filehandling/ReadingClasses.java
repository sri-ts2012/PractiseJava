package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadingClasses {
	
	public static void main(String[] args) throws Exception {
		
		File f=new File("C:\\Users\\bindu\\Desktop\\Myautofile.csv");
		FileReader fr=new FileReader(f);
		BufferedReader reader=new BufferedReader(fr);
		
		//read 
		String line=null;
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}
		reader.close();
		

}
}

