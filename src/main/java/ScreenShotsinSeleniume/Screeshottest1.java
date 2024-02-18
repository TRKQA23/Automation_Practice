package ScreenShotsinSeleniume;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screeshottest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		
		
		File Scree=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler
		
		FileUtils.copyFile(Scree,new File("\\Users\\Admin\\eclipse-workspace\\Auto\\src\\main\\java\\ScreenShotsinSeleniume"));
		
		

	}

}
