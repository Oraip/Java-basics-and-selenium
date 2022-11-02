import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class My_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
	//	driver.getTitle();
		String myTitle=driver.getTitle();
	   System.out.println("myTitle");
//	   String OptionTag=driver.findElement(By.tagName("option")).getText();
	//   System.out.println(OptionTag);
	// String myOptions =(driver.findElements(By.tagName("option"))).get(2).getText();
	 //  System.out.println(myOptions);
	   List <WebElement> myListOfOptions=driver.findElements(By.tagName("option"));
	   //System.out.println(myListOfOptions.size());
	   for(int i=0;i<myListOfOptions.size();i++)
	   {
		   System.out.println(myListOfOptions.get(i).getText());
	   }

	}

}
