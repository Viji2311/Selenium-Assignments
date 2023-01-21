package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebElement webElement = driver.findElement(By.xpath("(//span[@class='labelIcon'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(webElement);
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText());
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        List<WebElement> price = driver.findElements(By.id("display-price-680551486989"));
        List<WebElement> newPrice = new ArrayList<>(price);
        Collections.sort(newPrice);
        
		
	}

}
