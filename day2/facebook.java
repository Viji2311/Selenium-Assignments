package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("MITHUN BABU");
		driver.findElement(By.name("lastname")).sendKeys("R C");
		driver.findElement(By.name("reg_email__")).sendKeys("9994226258");
		driver.findElement(By.id("password_step_input")).sendKeys("Mithun@90");
		WebElement driver1=driver.findElement(By.id("day"));
		Select s = new Select(driver1);
		s.selectByValue("12");
		WebElement driver2 = driver.findElement(By.id("month"));
		Select ss = new Select(driver2);
		ss.selectByVisibleText("Oct");
		WebElement driver3 = driver.findElement(By.id("year"));
		Select s1 = new Select(driver3);
		s1.selectByValue("1990");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
				
		
				
		

	}

}
