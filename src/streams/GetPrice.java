package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPrice {
	//static WebDriver driver;//getting error if declared here without static as main is static
	
	//We can also create object of the class and use the static var,
	//as non static can use static(object belongs to class) 
	//but class does not belong to object, 
	//each object is different so cannot use non static under static.
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\chromedriver.exe");	

WebDriver  driver=new ChromeDriver(); //does it mean its static as initilised inside main 

	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	 driver.findElement(By.xpath("//tr/th[1]")).click();
	
	List<WebElement> veglist= driver.findElements(By.xpath("//tr/td[1]"));
	//using streams 
	//below gives all, so we apply filtr to beans
//	veglist.stream().map(s->getpriceitem()).collect(Collectors.toList())
	List<String> price=veglist.stream().filter(s->s.getText().contains("Beans")).map(s->getpriceitem(s)).collect(Collectors.toList());
	
price.forEach(a->System.out.println(a));
	
	
	//without streams

	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

			
		  driver.findElement(By.xpath("//tr/th[1]")).click();
			
		  /*		List<WebElement> veglist1= driver.findElements(By.xpath("//tr/td[1]"));
		
		ArrayList<String> originallist1=new ArrayList<String>();
		for(int i=0;i<veglist.size();i++)
		{			
			originallist1.add(veglist.get(i).getText());
		
		}
*/
	//dynamic way
	
	
	String veggie="Beans";
	int priceHeadingcolNumber=getColumnNumberofGivenColumnName("Price");
	System.out.println(priceHeadingcolNumber);
	int veggieHeadingcolNumber=getColumnNumberofGivenColumnName("Veg/fruit name");
	System.out.println(veggieHeadingcolNumber);
	
	
	
	int rowNumberofitem1=getRowNumberofGivenCellValue(veggie,veggieHeadingcolNumber);
	
	//if not dynamic
	String price3=driver.findElement(By.xpath("//tr[4]/td[2]")).getText();
	System.out.println("price 3 is "+price3);
	String price2=driver.findElement(By.xpath("//tr["+rowNumberofitem1+"]/td["+priceHeadingcolNumber+"]")).getText();
		System.out.println("price2 of "+veggie+"from dynamic way is "+price2);
	
		
		//without dynamic normal way
		String cellValue = "Beans";
	int rNum = getRowNumberOfCellData(cellValue);
	System.out.println("The row number in which the cell value : "+cellValue+" is available is : "+rNum);
	
	String price1 = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr["+rNum+"]/td[2]")).getText();
	
	System.out.println("The price of the  "+cellValue+" is "+price1);
	
	driver.quit();
}
	
	

	
	
	
	
	private static int getColumnNumberofGivenColumnName(String colName) {
		 List<WebElement> columnHeadings = driver.findElements(By.cssSelector("table.table-bordered>thead>tr>th>span:nth-child(1)"));
		 System.out.println("no of columns headings  is "+columnHeadings.size());
		 for(int colNum=0;colNum<columnHeadings.size();colNum++)
		 {
			String retrievedColName=columnHeadings.get(colNum).getText();
			System.out.println(retrievedColName);
			if(retrievedColName.equals(colName))
			{
			//	System.out.println(colNum);
				return ++colNum;
			}
		
		 }
			return-1;
		 }
		
	





	//private static int getRowNumberofGivenCellValue(String veggie, int veggieHeadingcolNumber) {
		public static int getRowNumberofGivenCellValue(String CellValue,int colNumber )
		{
			//here given till td ie col value thats why colvalues where in another methof of getrows till tr only so again have to write 
			List<WebElement> colValues = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td["+colNumber+"]"));
		System.out.println("cols size is "+colValues.size());
		//to print all values
		
		for(int rowNum=0;rowNum<colValues.size();rowNum++)
		{
			String retreivedColName=colValues.get(rowNum).getText();
			System.out.println(retreivedColName);
		}
		for(int rowNum=0;rowNum<colValues.size();rowNum++)
		{
			String retreivedColName=colValues.get(rowNum).getText();
			System.out.println(retreivedColName);
			//if you want to print all the values then write separe for loop to print for example as above, as once value found will come put of the loop
		//	System.out.println(rowNum);
			if(retreivedColName.equals(CellValue)){
				return ++rowNum;
			}
			
		}
		return -1;
		}

//or
	

public static int getRowNumberOfCellData(String cellData) {
	
	//System.out.println(driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr")));
	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr"));
	
	for(int rNum=0;rNum<rows.size();rNum++) {
		
		WebElement row = rows.get(rNum);
	
		
		List<WebElement> cells = row.findElements(By.tagName("td"));
	
		//System.out.println(cells.size());
		for(int cNum=0;cNum<cells.size();cNum++) {
			
			
			String retrievedCellData = cells.get(cNum).getText();
			
			if(retrievedCellData.equals(cellData)) {
				
				return ++rNum;
				
			}
			
		}
		
	}
	
	return -1;
	
}



	//method of streams
	private static String getpriceitem(WebElement s) {
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
	
	

}
