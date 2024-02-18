package CrossBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownlist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.bigbasket.com/");
		Thread.sleep(5000);

		WebElement Arrow = driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:r7:']"));

		Arrow.click();

		WebElement list = driver.findElement(By.xpath("//ul[@role='none']/li"));

		Select s = new Select(list);
		s.selectByVisibleText("Eggs");
		
	
		
		
		

	}

}
