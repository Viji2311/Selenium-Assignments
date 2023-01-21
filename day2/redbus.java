package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("Chen");
		driver.findElement(By.xpath("//li[contains(text(),'Chennai')]")).click();
		driver.findElement(By.id("dest")).sendKeys("Banga");
		driver.findElement(By.xpath("//li[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//tr/td[text()='16']")).click();
		driver.findElement(By.id("search_btn")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		
		driver.findElement(By.xpath("//label[contains(text(),'SLEEPER')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'V2K Travels')]")).getText());
		driver.findElement(By.xpath("//li[@id='11663188']//div[@class='button view-seats fr'][normalize-space()='View Seats']")).click();
	}

}
