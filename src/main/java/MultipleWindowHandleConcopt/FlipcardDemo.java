package MultipleWindowHandleConcopt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");

		try {
		    // Locate the 'Electronics' menu item
		    WebElement electronicsMenu = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));

		    // Create an instance of the Actions class
		    Actions actions = new Actions(driver);

		    // Move the cursor to the 'Electronics' menu item
		    actions.moveToElement(electronicsMenu).perform();

		    // Pause for a short time to allow sub-menu to appear (adjust as needed)
		    Thread.sleep(1000);

		    // Locate the 'Audio' submenu item
		    WebElement audioSubMenu = driver.findElement(By.xpath("//a[contains(text(),'Audio')]"));

		    // Move the cursor to the 'Audio' submenu item
		    actions.moveToElement(audioSubMenu).perform();

		    // Pause for a short time to allow sub-sub-menu to appear (adjust as needed)
		    Thread.sleep(1000);

		    // Locate and click the 'Bluetooth Headphone' option
		    WebElement bluetoothHeadphoneOption = driver.findElement(By.xpath("//a[contains(text(),'Bluetooth Headphones')]"));
		    bluetoothHeadphoneOption.click();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		} finally {
		    // Close the browser
		    
		

	}

}}
