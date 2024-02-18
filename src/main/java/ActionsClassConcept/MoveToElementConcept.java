package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		driver.manage().window().maximize();
		Thread.sleep(10);

		By Clicked = By.id("headlessui-menu-button-:R5bab6:");

		By L1 = By.xpath("//*[@id=\"headlessui-menu-items-:R9bab6:\"]/nav/ul[1]/li[2]/a");

		handleLevelMenu(Clicked, L1);

	} 

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void handleLevelMenu(By ParentMenu, By ChildMenu) {
		getElement(ParentMenu).click();
		Actions act = new Actions(driver);
		act.moveToElement(getElement(ChildMenu)).build().perform();
		// Thread.sleep(5);

	}

}
