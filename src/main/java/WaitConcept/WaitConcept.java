package WaitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();

		System.out.println("Dropdown list opened");

		Thread.sleep(10000);

		String URL = "https://www.google.com/gmail/about/";

		driver.findElement(By.linkText("Gmail")).click();

		if (driver.getCurrentUrl().equals(URL)) {
			System.out.println("User land on  gmail after  apply the wait for 10 Sec");

		}

	}

}
