package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingClasses {

	public static void main(String[] args) throws Exception {
		
		//stream connectivity
		File f=new File("C:\\Users\\bindu\\Desktop\\Myautofile.csv");
		//above we have to give the directory or path where we want the file to be created
		//append =false
	FileWriter fw=new FileWriter(f,false);//create a file and chain it to the file f
		//FileWriter is meant for writing streams of characters.For writing streams of raw bytes, consider using a FileOutputStream.
		BufferedWriter writer=new BufferedWriter(fw);
		
		//writing inside the file
		
		for(int i=0; i<4;i++)
		{
			for(int j=0; j<3;j++)
			{
				int num=(int)(Math.random()*100);
				writer.write(num+",");
				
			}
			writer.newLine();
		}
		/*writer.newLine();
		fw.write("i am");
		writer.newLine();
		writer.write("hi");
		writer.newLine();
		*/
		//closing the stream
		writer.close();
		System.out.println("filecreated");
		
	
	}

}
