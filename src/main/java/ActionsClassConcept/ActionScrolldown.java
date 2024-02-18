package ActionsClassConcept;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionScrolldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//page scroll down
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//act.sendKeys(Keys.PAGE_UP).build().perform();
		//used the  javascript  execuotr
		

	}

}
