package JavaScriptExecutorInterfaceTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScripExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver  driver= new EdgeDriver();	
		
		driver.get("https://tutorialsninja.com/demo/");
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("");

	}

}
