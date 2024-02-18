package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassTest {

	static WebDriver driver;

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		System.out.println("chrome browser launch  with  Bigbasket URL");

		try {
			// Locate the "Shop by Category" menu
			WebElement shopByCategory = driver.findElement(By.id("headlessui-menu-button-:R5bab6:"));

			// Create an instance of the Actions class
			Actions actions = new Actions(driver);

			// Click on "Shop by Category"
			actions.moveToElement(shopByCategory).click().perform();

			// Pause for a short time to allow the menu to expand (adjust as needed)
			Thread.sleep(1000);

			// Locate and click on "Beauty and Hygiene"
			WebElement beautyAndHygiene = driver.findElement(By.xpath("//span[contains(text(),'Beauty and Hygiene')]"));
			actions.moveToElement(beautyAndHygiene).click().perform();

			// Pause for a short time to allow the menu to expand (adjust as needed)
			Thread.sleep(1000);

			// Locate and click on "Makeup"
			WebElement makeup = driver.findElement(By.xpath("//a[contains(text(),'Makeup')]"));
			actions.moveToElement(makeup).click().perform();

			// Pause for a short time to allow the menu to expand (adjust as needed)
			Thread.sleep(1000);

			// Locate and click on "Nails"
			WebElement nails = driver.findElement(By.xpath("//a[contains(text(),'Nails')]"));
			actions.moveToElement(nails).click().perform();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			//driver.quit();
		}

	}
}
