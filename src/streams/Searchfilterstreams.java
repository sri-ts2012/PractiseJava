package streams;



	
		import java.util.ArrayList;
import java.util.List;

		import java.util.stream.Collectors;



		import org.openqa.selenium.By;

		import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.WebElement;

		import org.openqa.selenium.chrome.ChromeDriver;

		import org.testng.Assert;


		public class Searchfilterstreams {



		public static void main(String[] args) {

		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\chromedriver.exe");	

		        WebDriver driver=new ChromeDriver();

		        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		        driver.findElement(By.xpath("//tr/th[1]")).click();
		        driver.findElement(By.id("search-field")).sendKeys("Rice");

		        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));

		        //1 results

		       List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).

		        collect(Collectors.toList());

		       //1 result

		       Assert.assertEquals(veggies.size(), filteredList.size());
//without streams
		       
		       List<String> filteredList1=new ArrayList<String>();   
		       for(int i=0;i<veggies.size();i++)
		       {
		    	   String veg=veggies.get(i).getText();
		    	   if(veg.contains("Rice"))
		    			   {
		    		   filteredList1.add(veg);
		    		   System.out.println(filteredList1.size());
		    			   }
		       }
		       

		       Assert.assertEquals(veggies.size(), filteredList1.size());  
		       

		



	}

}
