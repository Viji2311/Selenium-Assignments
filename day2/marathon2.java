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
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class marathon2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev57553.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("5$dJ*EFdhhW0");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		WebElement one = shadow.findElementByXPath("//span[text()='Service Catalog']");
		one.click();
		WebElement two = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(two);
		driver.findElement(By.xpath("//h2[normalize-space()='Mobiles']")).click();
		driver.findElement(By.xpath("//strong[normalize-space()='iPhone 6s']")).click();
		WebElement three = driver.findElement(By.xpath("//select[@id='IO:8350086e4f334200086eeed18110c7cd']"));
		Select select = new Select(three);
		select.selectByValue("gold");
		WebElement four = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		Select s = new Select(four);
		s.selectByValue("onehudred_twentyeight");
		driver.findElement(By.id("oi_order_now_button")).click();

		System.out.println(driver.findElement(By.id("requesturl")).getText());
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/marathon2.png");
		FileUtils.copyFile(source, dest);

		
	}

}
