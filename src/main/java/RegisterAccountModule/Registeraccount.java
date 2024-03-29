package RegisterAccountModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registeraccount {

	@Test
	public void RegisterAccount() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		System.out.println("The Page  URL is  :-" + driver.getCurrentUrl());
		

		WebElement myAccountDropMenu = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		myAccountDropMenu.click();

		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();

		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys("Arun");

		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys("Motoori");

		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys("khope.tanmay20200@gmail.com");

		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("13Fb@1993");

		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");

		WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys("12345");

		WebElement privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();

		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();

		myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();

		WebElement logoutOption = driver.findElement(By.linkText("Logout"));

		Assert.assertTrue(logoutOption.isDisplayed());
		String actualURL = driver.getCurrentUrl();

		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(actualURL, expectedURL);

		String expectedHeading = "Your Account Has Been Created!";
		WebElement headingElement = driver.findElement(By.xpath("//div[@id='content']/h1"));
		String actualHeading = headingElement.getText();
		Assert.assertEquals(actualHeading, expectedHeading);

		WebElement actualCongradulationsElement = driver
				.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p"));
		String actualCongradulationsText = actualCongradulationsElement.getText();
		String expectedCongradulationsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualCongradulationsText, expectedCongradulationsText);

		WebElement actualmemberPrivilegesElement = driver
				.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[2]"));
		String actualmemberPrivilegesText = actualmemberPrivilegesElement.getText();
		String expectedmemberPrivilegesText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertTrue(actualmemberPrivilegesText.contains(expectedmemberPrivilegesText));

		WebElement actualmemberQuestionsElement = driver
				.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[3]"));
		String actualQuestionsText = actualmemberQuestionsElement.getText();
		String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));

		WebElement actualConfirmationEmailElement = driver
				.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[4]"));
		String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
		String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
		Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));

		WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLinkElement.isDisplayed());

		WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButtonElement.click();

		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "My Account";
		Assert.assertEquals(actualPageTitle, expectedPageTitle);

	}

}
