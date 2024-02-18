package MultipleWindowHandleConcopt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LightboxTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		// WebDriverManager.chromiumdriver().setup();

		WebDriver driver = new ChromeDriver();

	

		// Navigate to the Amazon website
		 driver.get("https://omayo.blogspot.com/");
		 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			driver.findElement(By.id("lightbox1")).click();
			
		

		//driver.get("https://www.flipkart.com/");

	}

}
