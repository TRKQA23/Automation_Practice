package LoginTestcaseModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LTC1 {

	ChromeDriver driver;
	WebElement myAccountDropMenu = null;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");

		myAccountDropMenu = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		myAccountDropMenu.click();

		WebElement Login = driver.findElement(By.xpath("(//ul[@class='dropdown-menu dropdown-menu-right']/li)[2]"));
		Login.click();

	}

	@Test
	public void LoginFunctionality() throws Exception {
		// Verify logging into the Application using valid credentials

		WebElement ValidEmailId = driver.findElement(By.xpath("//input[@id='input-email']"));
		ValidEmailId.sendKeys("khope.tanmay20200@gmail.com");

		WebElement validPassword = driver.findElement(By.id("input-password"));
		validPassword.sendKeys("13Fb@1993");

		Thread.sleep(10000);

		WebElement Loginbuttonclikc = driver.findElement(By.xpath("//input[@value='Login']"));
		Loginbuttonclikc.click();

		//System. out.println("user  login  successfully");

		String K = "https://tutorialsninja.com/demo/index.php?route=account/account";
		if (driver.getCurrentUrl().equals(K)) {
			System.out.println("user log in successfully");
		}

		else {

			System.out.println("Verify  your email address and  relogin");
		}

	}

}
