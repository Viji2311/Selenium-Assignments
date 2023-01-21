package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following::span[@class='ui-button-text ui-c']")).click();
		driver.switchTo().alert();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	}

}
