package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortingUsingStreams {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\chromedriver.exe");	

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	//sorting webtable 
			//1.click on column
			  driver.findElement(By.xpath("//tr/th[1]")).click();
			//2. capture all webelements into a list
		List<WebElement> veglist= driver.findElements(By.xpath("//tr/td[1]"));
		//above gets the tr tdlist
		
			//3.capture text of all webelements into new list(original list)
	
		//without streams
	//	String nameofveg;
		ArrayList<String> originallist1=new ArrayList<String>();
		for(int i=0;i<veglist.size();i++)
		{
			//nameofveg=veglist.get(i).getText();
			//if again want to put in the list
			 /*originallist1=new ArrayList<String>();
					originallist1.add(nameofveg);*/
			//or
			
			originallist1.add(veglist.get(i).getText());
			
			
		}
		//with streams
List<String> originalList=veglist.stream().map(s->s.getText()).collect(Collectors.toList());
		//without streams
List<String> sortedList1=new ArrayList<String>();
sortedList1.addAll(originallist1);
Collections.sort(sortedList1);
			//4.sort original list of step3--sorted
List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());


			//5.compare original lisr vs sorted list if same then list is sorted


//stream assert
Assert.assertTrue(originalList.equals(sortedList));
//without sgtreamassert
Assert.assertTrue(originallist1.equals(sortedList1));
	
	}
	

	
	
	

}
