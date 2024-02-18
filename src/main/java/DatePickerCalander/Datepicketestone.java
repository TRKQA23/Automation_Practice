package DatePickerCalander;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicketestone {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        
        
        
        
		
		
	}

}
