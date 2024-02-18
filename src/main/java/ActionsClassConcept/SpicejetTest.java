package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetTest {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		By parentID=By.xpath("//div[text()='Add-ons']");
		By ChildID=By.xpath("(//div[@class='css-1dbjc4n r-6gpygo r-cn9azx']/div)[1]");
		
		handleLevelMenu(parentID, ChildID);
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void handleLevelMenu(By ParentMenu, By ChildMenu) {
		getElement(ParentMenu).click();
		Actions act = new Actions(driver);
		act.moveToElement(getElement(ChildMenu)).build().perform();
		getElement(ChildMenu).click(); 

	}
}
