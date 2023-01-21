package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class marathon3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button/span[text()='Learn More']")).click();
		String parent =  driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(newWindow.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		Actions a = new Actions(driver);
		WebElement one = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		a.moveToElement(one).perform();
		shadow.setImplicitWait(10);
		WebElement certificate = shadow.findElementByXPath("//h4/a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click();", certificate);
		driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
		WebElement two = driver.findElement(By.xpath("//h1[text()='Salesforce Architect']"));
		a.scrollToElement(two);
		System.out.println(two.getText());
		WebElement three = driver.findElement(By.xpath("//a[text()='Application Architect']"));
		a.scrollToElement(three);
		List<WebElement> listOfCertifications = driver.findElements(By.className("credentials-card_title"));
		for(WebElement element:listOfCertifications)
		{
			System.out.println(element.getText());
			
		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/listofcertificates.png");
		FileUtils.copyFile(source, dest);
		

	}

}
