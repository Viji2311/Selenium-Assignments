package week2.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bookmyshow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		driver.getTitle();
		driver.findElement(By.xpath("//span[contains(text(),'Search for Movies, Events, Plays, Sports and Activities')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("Love Today");
		driver.findElement(By.xpath("//li[@class='sc-gJqsIT jMjMYb']//div[@class='sc-dXfzlN iPwaRU']")).click();
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='BVK Multiplex Vijayalakshmi: LB Nagar']")).getText());
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.xpath("(//img[@class='venue-info-icon lazy'])[1]")).click();
		
		
		String text2 = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]")).getText();
		Assert.assertEquals("Parking Facility", text2);
		driver.findElement(By.className("cross-container")).click();
		driver.findElement(By.xpath("//div[contains(text(),'01:30 PM')]")).click();
		driver.findElement(By.id("btnPopupAccept")).click();
		driver.findElement(By.id("pop_1")).click();
		driver.findElement(By.id("proceed-Qty")).click();
		driver.findElement(By.xpath("(//a[@class='_available'])[1]")).click();
		driver.findElement(By.id("btmcntbook")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Rs.200.00')]")).getText());
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./snap/bookMyShow.jpg");
        FileUtils.copyFile(screenshotAs, dest);
        driver.close();

	}

}
