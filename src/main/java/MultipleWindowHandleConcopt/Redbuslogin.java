package MultipleWindowHandleConcopt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbuslogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.redbus.in/");
		
		
		
		
		WebElement trainlink=driver.findElement(By.xpath("//a[text()='Book Train Tickets']"));
		trainlink.click();
        System.out.println(driver.getCurrentUrl());		 

	}

}
