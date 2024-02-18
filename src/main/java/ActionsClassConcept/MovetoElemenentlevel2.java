package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElemenentlevel2 {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method s

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		System.out.println("chrome browser launch  with  Bigbasket URL");

		driver.manage().window().maximize();
		Thread.sleep(10);

		By parent1Menu = By.id("headlessui-menu-button-:R5bab6:");

		// Thread.sleep(5000);

		By parent2Menu = By.xpath("//span[contains(text(),'Beauty and Hygiene')]");

		By ChildMenu = By.xpath("//a[contains(text(),'Makeup')]");

		HandleLevel2Menu(parent1Menu, parent2Menu, ChildMenu);

	}

	public static WebElement getlocator(By locator) {

		return driver.findElement(locator);

	}

	public static void HandleLevel2Menu(By parent1Menu, By parent2Menu, By ChildMenu) throws Exception {

		

		// getlocator(parent2Menu).click();

		Actions act = new Actions(driver);
		act.moveToElement(getlocator(parent1Menu)).build().perform();
		//Thread.sleep(3000);

		act.moveToElement(getlocator(parent2Menu)).build().perform();

		//Thread.sleep(3000);

		getlocator(ChildMenu).click();

	}

}
