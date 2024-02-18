package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement Dragg = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act = new Actions(driver);

		act.clickAndHold(Dragg).moveToElement(Drop).release().build().perform();

		driver.navigate().refresh();
		Thread.sleep(3000);
		act.dragAndDrop(Dragg, Drop).build().perform();
	}

}
