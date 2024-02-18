package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {

	static WebDriver driver;

	public static void main(String[] args) {

		String BrowserName = "Edge";

		switch (BrowserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			System.out.println("chrome browser launch  with  Bigbasket URL");

			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.bigbasket.com/");
			System.out.println("Firefox browser launch  with  Bigbasket URL");

			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.bigbasket.com/");
			System.out.println("Edge browser launch  with  Bigbasket URL");

			break;

		default:

			System.out.println("Please  pass the  correct  browsers");
			break;
		}

	}

}
