package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.manage().window().maximize();

		WebElement targetElement = driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/li)[3]"));

		Actions act = new Actions(driver);
		act.moveToElement(targetElement).click().build().perform();

	}

}
