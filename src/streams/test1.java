package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
	//count no of names starting with a in the list
/*	@Test
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			
			if(actual.startsWith("A"))
			count=count+1;
		}	
		System.out.println(count);
		
		
		}*/

/*	@Test
	public void streamsFilter()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
	//assign the arraylist to streams, which is collection of strings
	
//	names.stream();//will convert names to stream,filter based on condition and then apply terminal operation(count)
	Long c=names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(c);
	//there is no life for filter if no terminal
	//terminal will execute if only inter op returns true
	//we can create stream using below filter in stream API
//	Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.startsWith("A")).count();
//if method more than one line
	
long d=	Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
	{
		s.startsWith("A");
	//	returns false; then count will be 0
		return true;
	}).count();

	System.out.println(d);
	
	
//print all names 
	//here terminal is foreach()
	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
//print only fewnames using limit
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}*/
	
	
	@Test
	public void streamMap()
	{
		//print names which have last letter as a and convert to upper case
		//map to manipulate the stream object
		/*Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print names which have first letter as a  with uppercase and sorted,from arrays
*/		List<String> names =Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//if we want to chck presence of string then use method anymatch
		//here wont be using filter as filter is used to filter out based on a condition and we print it but any match method will chesk presece and returns boolean
		//both look similar but returns in a different way
		
		
		//concat to merge
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("man");
		names1.add("Don");
		names1.add("women");
		
		
	Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
			//.sorted().forEach(s->System.out.println(s));
	//newStream.sorted().forEach(s->System.out.println(s));
	//need to commnet above to do below as the stream is modified in the above line and we cannot perform anymatch on it, we need to have a create another stream otherwise
	
// presence of string then use method anymatch
Boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
Assert.assertTrue(flag);
		
		
	}
	
	@Test
	public void streamCollect()
	{
		//rral time frameworks ,prepare a new list, and send it to back end etc, we dont print in console
		//can convert to list/set/map
		
	List<String> ls=Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
	
	System.out.println(ls.get(0));
	//above can use using Limit(1) which we used in top section, collect also doing same in this example but in real time collect method is used for different purposes..
	
	List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
			//print unique number from thisarray
	
	//values.stream().distinct().forEach(s->System.out.println(s));
	
	//sort the array,before that disticnt so that unique element 
	
	List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li);
	System.out.println(li.get(2));
			
	}
	
	}



