package MultipleWindowHandleConcopt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	 	driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		String  textonchildwindo=driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(textonchildwindo);

	}

}


