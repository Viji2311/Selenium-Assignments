package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		driver.findElement(By.id("//label[@for='Men']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags (535)')]")).click();
		System.out.println(driver.findElement(By.className("length")).getText());
		System.out.println("List of Brands");
		List<WebElement> brands = driver.findElements(By.className("brand"));
		System.out.println("Size:"+brands.size());
		
		for(WebElement i :brands) {
			String text = i.getText();
			System.out.println(text);
		}
		
		System.out.println("List of Bag names:");
		List<WebElement> names = driver.findElements(By.className("nameCls"));
		System.out.println("Size:"+names.size());
		
		for(WebElement j : names) {
			String text1 = j.getText();
			System.out.println(text1);
		}
		

	}

}
