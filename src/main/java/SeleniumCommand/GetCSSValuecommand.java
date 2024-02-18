package SeleniumCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValuecommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://tutorialsninja.com/demo");

		System.out.println("open chrome browser via maven project setup");
		
		WebElement cartButton=driver.findElement(By.id("cart"));
		String CartButtonCssvalue=cartButton.getCssValue("color");
		System.out.println(CartButtonCssvalue);
		

	
	}

}
