package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationStreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\chromedriver.exe");	

	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	//sorting webtable 
			//1.click on column
			  driver.findElement(By.xpath("//tr/th[1]")).click();
			//2. capture all webelements into a list
	
			  List<String> price;
			  do{
		 List<WebElement> veglist= driver.findElements(By.xpath("//tr/td[1]"));
		price=veglist.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceItem(s)).collect(Collectors.toList());
		 price.forEach(a->System.out.println(a));
		 if(price.size()<1)
		 {
			 driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		 }
	}while(price.size()<1);
	}
			 
				private static String getPriceItem(WebElement s)
				{
		
			  String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
				return priceValue;
				}
		

	}


