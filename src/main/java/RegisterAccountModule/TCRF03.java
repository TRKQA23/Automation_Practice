package RegisterAccountModule;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCRF03 {
	
	EdgeDriver driver ;
	WebElement myAccountDropMenu = null;
	
	@BeforeMethod
	public void setup() {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		
		myAccountDropMenu = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		myAccountDropMenu.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
	}
	
	

	@Test
	public void  RegisteringanAccountbyprovidingallthefields()
	{
		
		
		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys("Tanmay");
		
		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys("Khope");
		
		Date date = new Date();
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(date.toString().replace(" ","_").replace(":","_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1234567890");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		
		WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys("12345");
		
		WebElement privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		
		//myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		//myAccountDropMenu.click();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		//driver.quit();
		
	}


}
