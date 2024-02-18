package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSendkeys {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.manage().window().maximize();

		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));

		Actions act = new Actions(driver);
		act.sendKeys(FirstName, "Tanmay").build().perform();
		act.sendKeys(lastName, "khope").build().perform();
		act.sendKeys(email, "ewewe").build().perform();
		act.sendKeys(phone, "4343434").build().perform();
	}

	public void doclickactionbylocator(By locator) {
		Actions act = new Actions(driver);
		act.click();

	}

	public void dosendkeys(By locotor, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getelement(locotor), value).build().perform();

	}

	public static WebElement getelement(By locator) {
		return driver.findElement(locator);

	}

}
