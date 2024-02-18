package SeleniumCommand;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sendkeycommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EdgeDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://tutorialsninja.com/demo");
		
		System.out.println("open Edge browser via maven project setup");
		
	}

}
