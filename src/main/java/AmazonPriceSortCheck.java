import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPriceSortCheck {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
      
    	WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the Amazon website
        driver.get("https://www.amazon.com/");

        // Perform a search (you can replace "laptop" with your search query)
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Wait for the search results to load
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".s-main-slot")));

        // Check if the "Sort by" dropdown is present
        WebElement sortByDropdown = driver.findElement(By.cssSelector("select#s-result-sort-select"));
        if (sortByDropdown.isDisplayed()) {
            // Select "Price: Low to High" option
            sortByDropdown.sendKeys("Price: Low to High");

            // Wait for the results to be reloaded with the sorted order
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".s-main-slot")));

            // Verify if the prices are sorted from low to high
            if (arePricesSorted(driver)) {
                System.out.println("Prices are sorted from low to high.");
            } else {
                System.out.println("Prices are not sorted from low to high.");
            }
        } else {
            System.out.println("Sort by dropdown is not present.");
        }

        // Close the browser
       // driver.quit();
    }

    private static boolean arePricesSorted(WebDriver driver) {
        // Extract the list of prices
        java.util.List<WebElement> priceElements = driver.findElements(By.cssSelector(".a-offscreen"));
        if (priceElements.size() < 2) {
            return true; // If there is only one or zero prices, consider it as sorted
        }

        // Check if the prices are in ascending order
        for (int i = 0; i < priceElements.size() - 1; i++) {
            double price1 = extractPrice(priceElements.get(i).getText());
            double price2 = extractPrice(priceElements.get(i + 1).getText());
            if (price1 > price2) {
                return false;
            }
        }
        return true;
    }

    private static double extractPrice(String priceText) {
        // Extract and convert the price text to a double value
        String cleanedPriceText = priceText.replaceAll("[^0-9.]", "");
        return Double.parseDouble(cleanedPriceText);
    }
}
