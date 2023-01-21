package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions a = new Actions(driver);
		WebElement one = driver.findElement(By.xpath("//a[text()='brands']"));
		a.moveToElement(one).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris",Keys.ENTER);
		driver.findElement(By.xpath("//a[normalize-space()=\"L'Oreal Paris\"]")).click();
		driver.getTitle();
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		WebElement three = driver.findElement(By.xpath("//span[text()='Formulation']"));
		a.scrollToElement(three).perform();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		
		driver.findElement(By.xpath("//div/span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Filters Applied']")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[normalize-space()=\"L'Oreal Paris Colour Protect Shampoo\"]")).click();
		String handle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(newWindow.get(1));
		WebElement two = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Select s = new Select(two);
		s.selectByVisibleText("175ml");
		System.out.println(driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText());
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		WebElement four = driver.findElement(By.xpath("//div[@class='css-1mx04mv e25lf6d3']"));
		System.out.println(four);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.linkText("Continue as guest")).click();
		WebElement five = driver.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']"));
		Assert.assertEquals(four, five);
		driver.quit();
		

	}

}
