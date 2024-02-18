import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleLinks {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Navigate to the Amazon website
		driver.get("https://omayo.blogspot.com/");

		List<WebElement> allhyplink = driver.findElements(By.xpath("//a"));

		System.out.println(allhyplink.size());

		for (WebElement E : allhyplink) {

			if (E.getAttribute("href") != null) {

				System.out.println(E.getAttribute("href"));
			}
		}

		/*
		 * List<WebElement> link =
		 * driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		 * 
		 * for (WebElement K : link) {
		 * 
		 * K.click(); String title = driver.getTitle();
		 * 
		 * System.out.println(title);
		 * 
		 * driver.navigate().back(); }
		 */

	}

}
