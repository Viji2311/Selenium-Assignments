package week3.day1;



import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
	
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
        System.out.println(price.size());
		List<Integer> allPrice = new ArrayList<>();
		for(int i=0;i<price.size();i++)
		{
			String text = price.get(i).getText();
			String replace = text.replace(",", "");
			if(!replace.trim().equals(""))
			{
			int finalPrice = Integer.parseInt(replace);
			if(finalPrice>0)
			{
				allPrice.add(finalPrice);
				
			}
			}
			
		Collections.sort(allPrice);
		System.out.println("the minimum price is"+allPrice.get(0));
			
		}

	}

}
