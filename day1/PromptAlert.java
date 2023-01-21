package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        Alert alert=  driver.switchTo().alert();
        alert.sendKeys("Vijayalakshmi");
        alert.accept();
        String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
        System.out.println(text);
        
        
        
		

	}

}
