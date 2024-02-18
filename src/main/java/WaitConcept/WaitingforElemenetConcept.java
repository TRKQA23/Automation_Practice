package WaitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitingforElemenetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();

		System.out.println(" WaitforElelement concept form  explicite wait");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement gmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		gmail.click();

		
	}

}
