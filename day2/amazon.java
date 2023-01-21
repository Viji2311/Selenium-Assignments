package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//a/span/span/span[@class='a-price-whole']")).getText());
		WebElement str = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom']"));
		Actions a = new Actions(driver);
		a.moveToElement(str).perform();
		System.out.println(driver.findElement(By.xpath("//span[@data-hook='total-review-count']")));
		driver.findElement(By.xpath("(//a[@target='_blank']/span)[1]")).click();
		WebElement str1 = driver.findElement(By.id("productTitle"));
		File source = str1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/amazonpage.png");
		FileUtils.copyFile(source, dest);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		String str2 = driver.findElement(By.xpath("//span/span[@id='attach-accessory-cart-subtotal']")).getText();
	    Assert.assertEquals(str2, "66,999.00");
	    driver.quit();
		
		
	}

}
