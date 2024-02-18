package ActionsClassConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickusingAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightclick = driver.findElement(By.cssSelector("span.context-menu-one"));

		Actions act = new Actions(driver);
		act.contextClick(rightclick).build().perform();

		List<WebElement> Optionslist = driver
				.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li/span"));
		// ctr+shft+2

		System.out.println(Optionslist.size());

		for (WebElement e : Optionslist) {

			String text = e.getText();

			System.out.println(text);

			if (e.equals("Copy"))
			{
				e.click();
			break;
			}
		}

	}

}
